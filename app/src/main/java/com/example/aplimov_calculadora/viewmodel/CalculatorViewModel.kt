package com.example.aplimov_calculadora.viewmodel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.aplimov_calculadora.model.Calculator


class CalculatorViewModel : ViewModel() {

    private val _expression = MutableLiveData("")
    val expression: LiveData<String> = _expression

    private val _result = MutableLiveData("")
    val result: LiveData<String> = _result

    fun append(value: String) {
        _expression.value += value
    }

    fun delete() {
        _expression.value = _expression.value?.dropLast(1)
    }

    fun clear() {
        _expression.value = ""
        _result.value = ""
    }

    fun calculate() {
        val expr = _expression.value ?: ""
        _result.value = Calculator.evaluateExpression(expr)
    }
}