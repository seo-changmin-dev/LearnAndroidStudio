package com.scmdev.kotlinsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.scmdev.kotlinsample.databinding.LayoutVariableBinding
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {

    var clickCount = 0;
    val startTime = System.currentTimeMillis()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val thisBinding = LayoutVariableBinding.inflate(layoutInflater)
        setContentView(thisBinding.root)

        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)
        thisBinding.tvStartTime.text = "Activity 시작시간: $timeText"

        thisBinding.tvClickCnt.text = "버튼 클릭 횟수: $clickCount"
        thisBinding.btnClick.setOnClickListener {
            clickCount += 1;

            thisBinding.tvClickCnt.text = "버튼 클릭 횟수: $clickCount"
        }
    }
}