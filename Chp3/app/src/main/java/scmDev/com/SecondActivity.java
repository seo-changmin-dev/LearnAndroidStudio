package scmDev.com;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    //가속도가 3, 최고속도가 100, 감속도가 4
    Car car1 = new Car(3,100,4);
    //가속도가 10, 최고속도가 50, 감속도가 8
    Car car2 = new Car(10,50,8);
    SportsCar car3 = new SportsCar(15,150,10);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자!", Toast.LENGTH_LONG).show();

        // acceleration
        findViewById(R.id.btn_test1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car1.accelerationPedal();
                car2.accelerationPedal();
                car3.accelerationPedal();

                String info = "car1: " + car1.getCurrentSpeedText() + "\ncar2: " + car2.getCurrentSpeedText();
                info += '\n' + car3.getCurrentSpeedText();
                Toast.makeText(getApplicationContext(),info,Toast.LENGTH_SHORT).show();
            }
        });

        // deceleration
        findViewById(R.id.btn_test2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car1.brakePedal();
                car2.brakePedal();
                car3.brakePedal();

                String info = "car1: " + car1.getCurrentSpeedText() + "\ncar2: " + car2.getCurrentSpeedText();
                info += '\n' + car3.getCurrentSpeedText();
                Toast.makeText(getApplicationContext(),info,Toast.LENGTH_SHORT).show();
            }
        });
    }
}