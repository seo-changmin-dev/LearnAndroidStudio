package com.scmdev.kotlinsample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.scmdev.kotlinsample.databinding.LayoutControlBinding

class ControlKotlinActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val thisBinding = LayoutControlBinding.inflate(layoutInflater)
        setContentView(thisBinding.root)

        thisBinding.btnExcute.setOnClickListener {
            val number = thisBinding.numberField.text.toString().toInt()

            when {
                number % 2 == 0 -> Toast.makeText(applicationContext, "$number 는 2의 배수 입니다", Toast.LENGTH_SHORT).show()
                number % 3 == 0 -> {
                    Toast.makeText(applicationContext, "$number 는 3의 배수 입니다", Toast.LENGTH_SHORT).show()
                }
                else -> Toast.makeText(applicationContext, "$number", Toast.LENGTH_SHORT).show()
            }

            when (number) {
                in 1..4 -> thisBinding.btnExcute.text = "실행 - 4"
                9, 18 -> {
                    thisBinding.btnExcute.text = "실행 - 9"
                }
                else -> thisBinding.btnExcute.text = "실행"
            }

        }
    }
}