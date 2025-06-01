package com.aas.aasportfolioprojects_4;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        RecyclerView list = findViewById(R.id.recycler_view_projects);


                // Create an array of Project objects
        Project[] projects = {
                new Project("Getting Started", "Our very first project, the default 'Hello world' project", R.drawable.getting_started),
                new Project("AAS Quote", "Simple quote project, personal motivational quote for software developers", R.drawable.quote),
                new Project("BMI Calculator", "Real life BMI calculator, calculates BMI for all ages and genders", R.drawable.calculator),
                new Project("Simply Calculate", "Simple converter, converts inches to meters", R.drawable.tape),
                new Project("The Hungry Developer", "A menu app for fictional restaurant, startes, main courses and desserts", R.drawable.hungry_developer)
        };



    }
}