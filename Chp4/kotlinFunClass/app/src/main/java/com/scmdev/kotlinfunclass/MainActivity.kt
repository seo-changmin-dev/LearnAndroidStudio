package com.scmdev.kotlinfunclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.scmdev.kotlinfunclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val thisBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(thisBinding.root)

        thisBinding.btnTestJava.setOnClickListener {
            startActivity(Intent(this, ControlJava::class.java))
        }

        thisBinding.btnTestKotlin.setOnClickListener {
            startActivity(Intent(this, ControlKotlin::class.java))
        }
    }
}