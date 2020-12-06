package com.fouzia.caloriescalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
  TextView e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        e1 = findViewById(R.id.excercise);
        String[] excercise_name = {
                "Clapping Crunch",
                "Push Up",
                "Sit Up",
                "Knee Push Up",
                "Squat",
                "Jumping Jacks",
                "Burpees",
                "Half Squat",
                "Jumping",
                "Droan",
                "Split",
                "Side planks",
                "Plank",
                "Dumbbell rows",
        };

        for (String excerciseValue : excercise_name)
        {
            e1.append(excerciseValue +"\n\n");

        }


    }
}