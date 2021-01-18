package com.scmdev.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.scmdev.lotto.databinding.ActivityMainBinding
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val thisBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(thisBinding.root)

        thisBinding.cvRandom.setOnClickListener{
            val intent = Intent(this, ResultActivity::class.java)

            intent.putIntegerArrayListExtra("result", ArrayList(getShuffleLottoNumbers()))
            startActivity(intent)
        }

        thisBinding.cvConstellation.setOnClickListener{
            startActivity(Intent(this,ConstellationActivity::class.java))
        }

        thisBinding.cvName.setOnClickListener {
            startActivity(Intent(this,NameActivity::class.java))
        }
    }

    private fun getRandomLottoNumber(): Int {
        return Random.nextInt(45) + 1
    }

    fun getRandomLottoNumbers(): MutableList<Int> {
        val lottoNumbers = mutableListOf<Int>()

        for(i in 1..6) {
            var number = 0
            do {
                number = getRandomLottoNumber()
            } while(lottoNumbers.contains(number))

            lottoNumbers.add(number)
        }

        return lottoNumbers
    }

    fun getShuffleLottoNumbers(): MutableList<Int> {
        val list = mutableListOf<Int>()

        for(number in 1..45) {
            list.add(number)
        }

        list.shuffle()

        return list.subList(0,6)
    }
}

