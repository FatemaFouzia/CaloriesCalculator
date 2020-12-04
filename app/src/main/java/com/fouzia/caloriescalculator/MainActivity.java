package com.fouzia.caloriescalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2, n3;
    TextView a1, h1, w1;
    Button c1,b1;
    TextView r1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //edit text
        n1 = findViewById(R.id.InYears);
        n2 = findViewById(R.id.inches);
        n3 = findViewById(R.id.ibs);
        //text view
        h1 = findViewById(R.id.height);
        a1 = findViewById(R.id.age);
        w1 = findViewById(R.id.weight);
        c1 = findViewById(R.id.calculate);
        r1 = findViewById(R.id.result);
        b1 =findViewById(R.id.bmi);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(n1.getText().toString());
                double number2 = Double.parseDouble(n2.getText().toString());
                double number3 = Double.parseDouble(n3.getText().toString());

                double ans = calculate(number1, number2, number3);
                r1.setText(String.valueOf(ans));
//                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
//                startActivity(intent);

            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

                //statActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
    }

    private double calculate(double number1, double number2, double number3) {
        double ans = 0.0;
        ans = 66 + (6.3 * number3) + (12.9 * number2) - (6.8 * number1);
        return ans;

    }
}