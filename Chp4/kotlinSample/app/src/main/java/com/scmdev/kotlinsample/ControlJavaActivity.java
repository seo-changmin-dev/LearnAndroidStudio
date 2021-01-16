package com.scmdev.kotlinsample;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.scmdev.kotlinsample.databinding.LayoutControlBinding;

public class ControlJavaActivity extends AppCompatActivity {

    LayoutControlBinding thisBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        thisBinding = LayoutControlBinding.inflate(getLayoutInflater());
        setContentView(thisBinding.getRoot());

        thisBinding.btnExcute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberText = thisBinding.numberField.getText().toString();
                int number = Integer.parseInt(numberText);

                if(number % 2 == 0) {
                    Toast.makeText(getApplicationContext(), "" + number + "는 2의 배수입니다.", Toast.LENGTH_SHORT).show();
                } else if (number % 3 == 0) {
                    Toast.makeText(getApplicationContext(), "" + number + "는 3의 배수입니다.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "" + number, Toast.LENGTH_SHORT).show();
                }

                switch (number) {
                    case 4:
                        thisBinding.btnExcute.setText("실행 - 4");
                        break;
                    case 9:
                        thisBinding.btnExcute.setText("실행 - 9");
                        break;
                    default:
                        thisBinding.btnExcute.setText("실행");
                        break;
                }
            }
        });
    }
}