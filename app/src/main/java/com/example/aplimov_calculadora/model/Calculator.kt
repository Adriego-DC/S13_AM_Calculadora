package com.example.aplimov_calculadora.model

object Calculator {
    fun evaluateExpression(expression: String): String {
        return try {
            val result = evaluate(expression)
            result.toString()
        } catch (e: Exception) {
            "Error"
        }
    }

    private fun evaluate(expr: String): Double {
        val cleanExpr = expr.replace("×", "*")
            .replace("÷", "/")
            .replace("√", "sqrt")

        val tokens = tokenize(cleanExpr)
        val postfix = infixToPostfix(tokens)
        return evaluatePostfix(postfix)
    }

    private fun tokenize(expr: String): List<String> {
        val regex = Regex("""(sqrt|\d+\.?\d*|\.\d+|[%+*/^()-])""")
        return regex.findAll(expr.replace("\\s+".toRegex(), "")).map { it.value }.toList()
    }

    private fun infixToPostfix(tokens: List<String>): List<String> {
        val output = mutableListOf<String>()
        val stack = mutableListOf<String>()
        val precedence = mapOf(
            "sqrt" to 4,
            "%" to 3,
            "^" to 3,
            "*" to 2,
            "/" to 2,
            "+" to 1,
            "-" to 1
        )

        for (token in tokens) {
            when {
                token.toDoubleOrNull() != null -> output.add(token)
                token == "(" -> stack.add(token)
                token == ")" -> {
                    while (stack.isNotEmpty() && stack.last() != "(") {
                        output.add(stack.removeAt(stack.lastIndex))
                    }
                    if (stack.isNotEmpty() && stack.last() == "(") stack.removeAt(stack.lastIndex)
                }
                token in precedence -> {
                    while (stack.isNotEmpty() && stack.last() != "(" &&
                        precedence[token]!! <= precedence[stack.last()]!!
                    ) {
                        output.add(stack.removeAt(stack.lastIndex))
                    }
                    stack.add(token)
                }
            }
        }

        while (stack.isNotEmpty()) {
            output.add(stack.removeAt(stack.lastIndex))
        }

        return output
    }

    private fun evaluatePostfix(postfix: List<String>): Double {
        val stack = mutableListOf<Double>()

        for (token in postfix) {
            when {
                token.toDoubleOrNull() != null -> stack.add(token.toDouble())
                token == "sqrt" -> {
                    val a = stack.removeAt(stack.lastIndex)
                    stack.add(Math.sqrt(a))
                }
                token == "%" -> {
                    // Si hay otro número debajo, calcula a % b → (a / 100) * b
                    val a = stack.removeAt(stack.lastIndex)
                    val value = if (stack.isNotEmpty()) {
                        val b = stack.removeAt(stack.lastIndex)
                        (a / 100) * b
                    } else {
                        a / 100
                    }
                    stack.add(value)
                }
                token in listOf("+", "-", "*", "/", "^") -> {
                    val b = stack.removeAt(stack.lastIndex)
                    val a = stack.removeAt(stack.lastIndex)
                    val result = when (token) {
                        "+" -> a + b
                        "-" -> a - b
                        "*" -> a * b
                        "/" -> a / b
                        "^" -> Math.pow(a, b)
                        else -> throw IllegalArgumentException("Unknown operator: $token")
                    }
                    stack.add(result)
                }
            }
        }

        return stack[0]
    }
}
