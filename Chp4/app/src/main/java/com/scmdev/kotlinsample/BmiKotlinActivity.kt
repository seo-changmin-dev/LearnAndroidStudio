package com.scmdev.kotlinsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.scmdev.kotlinsample.databinding.LayoutViewBindingBinding
import kotlin.math.pow

class BmiKotlinActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutBinding = LayoutViewBindingBinding.inflate(layoutInflater)
        setContentView(layoutBinding.root)

        layoutBinding.btnCalculateBmi.setOnClickListener {
            val tall = layoutBinding.tallField.text.toString().toDouble()
            val weight = layoutBinding.weightField.text.toString().toDouble()

            val bmi = tall / (weight / 100.0).pow(2.0)

            layoutBinding.resultLabel.text = "키: ${tall}, 체중: ${weight}\nBMI: $bmi"
        }
    }
}