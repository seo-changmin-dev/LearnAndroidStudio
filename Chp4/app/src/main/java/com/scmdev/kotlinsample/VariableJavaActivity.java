package com.scmdev.kotlinsample;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.scmdev.kotlinsample.databinding.LayoutVariableBinding;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {

    private LayoutVariableBinding thisBinding;

    int clickCount = 0;
    long startTime = System.currentTimeMillis();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        thisBinding = LayoutVariableBinding.inflate(getLayoutInflater());
        View view = thisBinding.getRoot();
        setContentView(view);

        String timeText = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);
        thisBinding.tvStartTime.setText("Activity 시작시간: " + timeText);

        thisBinding.btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount += 1;

                thisBinding.tvClickCnt.setText("클릭횟수: " + clickCount);
            }
        });
    }
}