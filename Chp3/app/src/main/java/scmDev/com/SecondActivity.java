package scmDev.com;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    int clickCount1 = 0;
    int clickCount2 = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자!", Toast.LENGTH_LONG).show();

        findViewById(R.id.btn_test1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount1 += 1;

                Toast.makeText(getApplicationContext(),getMessage(clickCount1),Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btn_test2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount2 += 1;

                Toast.makeText(getApplicationContext(), getMessage(clickCount2), Toast.LENGTH_SHORT).show();
            }
        });
    }

    String getMessage(int clickCount) {
        if(clickCount%2 == 0) {
            return "clickCount: " + clickCount;
        } else if(clickCount%3 == 0) {
            return "Hello, Korea!";
        } else {
            return "Hello";
        }
    }
}