package com.scmdev.lotto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.scmdev.lotto.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val thisBinding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(thisBinding.root)

        thisBinding.button.setOnClickListener {
            val intent = Intent(this@TestActivity, MainActivity::class.java)
            startActivity(intent)
        }

        thisBinding.button2.setOnClickListener {
            val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
            startActivity(intent)
        }

        thisBinding.button3.setOnClickListener {
            val intent = Intent(this@TestActivity, NameActivity::class.java)
            startActivity(intent)
        }

        /*thisBinding.button4.setOnClickListener {
            val intent = Intent(this@TestActivity, ResultActivity::class.java)
            startActivity(intent)
        }*/

        thisBinding.button5.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"))
            startActivity(intent)
        }
    }
    // xml에서 참조할 수 있게 메소드를 정의한다.
    fun goResult(view: View) {
        val intent = Intent(this@TestActivity, ResultActivity::class.java)
        startActivity(intent)
    }

    fun callWeb(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"))
        startActivity(intent)
    }
}