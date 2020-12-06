package com.fouzia.caloriescalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText n1, n2, n3;
    TextView a1, h1, w1;
    Button c1,b1;
    TextView r1;
    Spinner l1;
    String[] level={"Beginner","Intermediate","Advanced"};

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
        l1 = findViewById(R.id.start_level);


        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item, level);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // The drop down view
        l1.setAdapter(spinnerArrayAdapter);




        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n1.getText().toString().isEmpty()||n2.getText().toString().isEmpty()||n3.getText().toString().isEmpty())
                {
                    n1.setError("Please Enter Value");
                    n2.setError("Please Enter Value");
                    n3.setError("Please Enter Value");

                }
                else{

                    double number1 = Double.parseDouble(n1.getText().toString());
                    double number2 = Double.parseDouble(n2.getText().toString());
                    double number3 = Double.parseDouble(n3.getText().toString());

                    double ans = calculate(number1, number2, number3);
                    r1.setText(String.valueOf(ans));
//                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
//                startActivity(intent);
                }

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"Item 1 selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"Item 2 selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"Item 3 selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.sub_1:
                Toast.makeText(this,"SubItem 1 selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.sub_2:
                Toast.makeText(this,"SubItem 2 selected", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private double calculate(double number1, double number2, double number3) {
        double ans = 0.0;
        ans = 66 + (6.3 * number3) + (12.9 * number2) - (6.8 * number1);
        return ans;

    }
}