package com.jessejsamuel.portfolio;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button degreesButton = findViewById(R.id.degrees);
        Button coursesButton = findViewById(R.id.courses);
        Button projectsButton = findViewById(R.id.projects);
        Button personalButton = findViewById(R.id.personal);
        Button citiesButton = findViewById(R.id.cities);

        degreesButton.setOnClickListener(v -> {
            Intent i = new Intent(this, DegreesActivity.class);
            startActivity(i);
        });

        coursesButton.setOnClickListener(v -> {
            Intent i = new Intent(this, CoursesActivity.class);
            startActivity(i);
        });

        projectsButton.setOnClickListener(v -> {
            Intent i = new Intent(this, ProjectsActivity.class);
            startActivity(i);
        });

        personalButton.setOnClickListener(v -> {
            Intent i = new Intent(this, PersonalActivity.class);
            startActivity(i);
        });

        citiesButton.setOnClickListener(v -> {
            Intent i = new Intent(this, CitiesActivity.class);
            startActivity(i);
        });
    }
}