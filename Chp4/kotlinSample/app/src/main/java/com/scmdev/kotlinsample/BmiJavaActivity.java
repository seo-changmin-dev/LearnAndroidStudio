package com.scmdev.kotlinsample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BmiJavaActivity extends AppCompatActivity {

    //private LayoutViewBindingBinding layoutBinding;

    EditText tallField;
    EditText weightField;
    TextView resultLabel;
    Button bmiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_view_binding);

        tallField = findViewById(R.id.tallField);
        weightField = findViewById(R.id.weightField);
        resultLabel = findViewById(R.id.resultLabel);
        bmiButton = findViewById(R.id.btn_calculateBmi);

        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tall = tallField.getText().toString();
                String weight = weightField.getText().toString();

                double bmi = Double.parseDouble(weight) / Math.pow(Double.parseDouble(tall) / 100.0, 2);

                resultLabel.setText("키: " + tall + " 체중: " + weight + "\nBMI: " + bmi);
            }
        });

       /*layoutBinding = LayoutViewBindingBinding.inflate(getLayoutInflater());
        View view = layoutBinding.getRoot();
        setContentView(view);

        layoutBinding.btnCalculateBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tall = Double.parseDouble(layoutBinding.tallField.getText().toString());
                double weight = Double.parseDouble(layoutBinding.weightField.getText().toString());

                double bmi = weight / Math.pow(tall / 100.0, 2);

                layoutBinding.resultLabel.setText("키: " + tall + " 체중: " + weight + "\nBMI: " + bmi);
            }
        });*/
    }
}