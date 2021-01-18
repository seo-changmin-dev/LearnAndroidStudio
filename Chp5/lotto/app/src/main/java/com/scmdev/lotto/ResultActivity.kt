package com.scmdev.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.annotation.BinderThread
import com.scmdev.lotto.databinding.ActivityResultBinding
import java.text.SimpleDateFormat
import java.util.*

class ResultActivity : AppCompatActivity() {

    val lottoImageStartId = R.drawable.ball_01

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // viewBinding
        val thisBinding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(thisBinding.root)

        val result = intent.getIntegerArrayListExtra("result")
        val name = intent.getStringExtra("name")

        if(!TextUtils.isEmpty(name)) {
            thisBinding.tvResultLabel.text = "${name}님의\n${SimpleDateFormat("yyyy년 MM월 dd일").format(Date())}\n로또 번호입니다"
        }

        result?.let {
            updateLottoBallImage(result.sortedBy { it })
        }


    }

    fun updateLottoBallImage(result: List<Int>) {
        if(result.size < 6) return

        val thisBinding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(thisBinding.root)

        thisBinding.ivBall1.setImageResource(lottoImageStartId + (result[0] - 1))
        thisBinding.ivBall2.setImageResource(lottoImageStartId + (result[1] - 1))
        thisBinding.ivBall3.setImageResource(lottoImageStartId + (result[2] - 1))
        thisBinding.ivBall4.setImageResource(lottoImageStartId + (result[3] - 1))
        thisBinding.ivBall5.setImageResource(lottoImageStartId + (result[4] - 1))
        thisBinding.ivBall6.setImageResource(lottoImageStartId + (result[5] - 1))
    }
}