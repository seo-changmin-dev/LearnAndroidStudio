package com.scmdev.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.scmdev.lotto.databinding.ActivityNameBinding
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val thisBinding = ActivityNameBinding.inflate(layoutInflater)
        setContentView(thisBinding.root)

        thisBinding.btnGo.setOnClickListener {
            if(TextUtils.isEmpty(thisBinding.etName.text.toString())) return@setOnClickListener

            val intent = Intent(this,ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getLottoNumbersFromHash(thisBinding.etName.text.toString())))
            intent.putExtra("name",thisBinding.etName.text.toString())
            startActivity(intent)
        }

        thisBinding.btnBack.setOnClickListener {
            finish()
        }
    }

    fun getLottoNumbersFromHash(name: String): MutableList<Int> {
        val list = mutableListOf<Int>()

        for(number in 1..45) {
            list.add(number)
        }

        val targetString = SimpleDateFormat("yyyy-MM-dd", Locale.KOREA).format(Date()) + name

        list.shuffle(Random(targetString.hashCode().toLong()))

        return list.subList(0,6)
    }

}