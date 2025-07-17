package com.example.aplimov_calculadora.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.aplimov_calculadora.databinding.ActivityMainBinding
import com.example.aplimov_calculadora.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: CalculatorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.expression.observe(this, Observer {
            binding.tvExpression.text = it
        })

        viewModel.result.observe(this, Observer {
            binding.tvResult.text = it
        })

        val buttons = listOf(
            binding.btn0 to "0", binding.btn1 to "1", binding.btn2 to "2",
            binding.btn3 to "3", binding.btn4 to "4", binding.btn5 to "5",
            binding.btn6 to "6", binding.btn7 to "7", binding.btn8 to "8",
            binding.btn9 to "9", binding.btnDot to ".", binding.btnAdd to "+",
            binding.btnSub to "-", binding.btnMul to "×", binding.btnDiv to "÷",
            binding.btnPercent to "%", binding.btnPow to "^", binding.btnSqrt to "√"
        )

        buttons.forEach { (button, value) ->
            button.setOnClickListener { viewModel.append(value) }
        }

        binding.btnEqual.setOnClickListener { viewModel.calculate() }
        binding.btnClear.setOnClickListener { viewModel.clear() }
        binding.btnDelete.setOnClickListener { viewModel.delete() }
    }
}