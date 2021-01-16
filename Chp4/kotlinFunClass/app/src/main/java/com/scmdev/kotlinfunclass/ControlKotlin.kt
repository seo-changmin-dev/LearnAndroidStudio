package com.scmdev.kotlinfunclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.scmdev.kotlinfunclass.databinding.ActivitySecondBinding

class ControlKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val thisBinding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(thisBinding.root)

        thisBinding.btnExcute.setOnClickListener {
            val number = thisBinding.etNumber.text.toString().toInt()

            when {
                number % 2 == 0 -> toastShort("${number}는 2의 배수입니다")
                number % 3 == 0 -> toastShort("${number}는 3의 배수입니다")
                else -> toastLong("${number}는 2의 배수도, 3의 배수도 아닙니다")
            }
        }
    }
}