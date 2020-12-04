package com.fouzia.caloriescalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView text1, text2;
    EditText he1, we1;
    Button b2;
    TextView r2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text1 = findViewById(R.id.height2);
        text2 = findViewById(R.id.weight2);
        he1 = findViewById(R.id.inches2);
        we1 = findViewById(R.id.ibs2);

        b2 = findViewById(R.id.calculate2);
        r2 = findViewById(R.id.result2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(he1.getText().toString());
                double number2 = Double.parseDouble(we1.getText().toString());


                double ans = calculate( number1, number2);
                r2.setText(String.valueOf(ans));
//                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
//                startActivity(intent);

            }


        });

    }

    private double calculate(double he1, double we1) {
        double ans = 0.0;
        ans = 703 * (we1 / (he1 * he1));
        return ans;
    }

}