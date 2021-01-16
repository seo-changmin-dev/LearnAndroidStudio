package com.scmdev.kotlinfunclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.scmdev.kotlinfunclass.databinding.ActivitySecondBinding;

public class ControlJava extends AppCompatActivity {

    ActivitySecondBinding thisBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        thisBinding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(thisBinding.getRoot());

        thisBinding.btnExcute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberField = thisBinding.etNumber.getText().toString();
                int number = Integer.parseInt(numberField);

                if(number % 2 == 0) {
                    ToastUtilJava.toastShort("" + number + "는 2의 배수입니다");
                } else if(number % 3 == 0) {
                    ToastUtilJava.toastShort("" + number + "는 3의 배수입니다");
                } else {
                    ToastUtil.toastLong("" + number + "는 2의 배수도, 3의 배수도 아닙니다");
                }
            }
        });
    }
}