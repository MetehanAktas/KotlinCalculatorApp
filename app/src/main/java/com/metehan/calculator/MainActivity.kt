package com.metehan.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.metehan.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }

    fun mySum(view: View){
        val number1 = binding.number1Text.text.toString().toDoubleOrNull()
        val number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null ){
            val result = number1 + number2
            binding.resultText.text = "Result: ${result}"
        }else{
            binding.resultText.text = "Enter Number!!!"
        }
    }

    fun mySub(view: View){
        val number1 = binding.number1Text.text.toString().toDoubleOrNull()
        val number2 = binding.number2Text.text.toString().toDoubleOrNull()
        if (number1 != null && number2 != null ){
            val result = number1 - number2
            binding.resultText.text = "Result: ${result}"
        }else{
            binding.resultText.text = "Enter Number!!!"
        }
    }

    fun myMultiply(view: View){
        val number1 = binding.number1Text.text.toString().toDoubleOrNull()
        val number2 = binding.number2Text.text.toString().toDoubleOrNull()
        if (number1 != null && number2 != null ){
            val result = number1 * number2
            binding.resultText.text = "Result: ${result}"
        }else{
            binding.resultText.text = "Enter Number!!!"
        }
    }

    fun myDiv(view: View){
        val number1 = binding.number1Text.text.toString().toDoubleOrNull()
        val number2 = binding.number2Text.text.toString().toDoubleOrNull()
        if (number1 != null && number2 != null ){
            val result = number1 / number2
            binding.resultText.text = "Result: ${result}"
        }else{
            binding.resultText.text = "Enter Number!!!"
        }
    }


}