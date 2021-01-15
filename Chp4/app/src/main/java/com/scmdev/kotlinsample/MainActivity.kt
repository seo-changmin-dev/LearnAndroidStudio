package com.scmdev.kotlinsample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.scmdev.kotlinsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.btnJava.setOnClickListener {
            startActivity(Intent(this, BmiJavaActivity::class.java))
        }

        mainBinding.btnKotlin.setOnClickListener {
            startActivity(Intent(this, BmiKotlinActivity::class.java))
        }
    }
}