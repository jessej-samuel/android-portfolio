package com.jessejsamuel.portfolio;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class ProjectsActivity extends AppCompatActivity {

    ListView projectListView;

    String[] titles = {"Spotipy", "Wiki Search", "Air Traveler", "Game of Life"};
    String[] descriptions = {
            "Music player made with React and Redux \uD83D\uDE80",
            "A minimalist app to surf Wikipedia",
            "End semester project for Fall 2022",
            "Conway's Game of Life is a zero player game played by the computer itself based on the algorithm of cellular automata."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        projectListView = findViewById(R.id.projectList);

        ArrayList<HashMap<String,Object>> projectData = new ArrayList<>();

        for (int i = 0; i < titles.length; i++) {
            HashMap<String,Object> dataItem = new HashMap<>();
            dataItem.put("title",titles[i]);
            dataItem.put("description", descriptions[i]);

            projectData.add(dataItem);
        }

        String[] from = {"title","description"};

        int[] to = {R.id.projectTitle,R.id.projectDescription};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,projectData,R.layout.project_card,from, to);

        projectListView.setAdapter(simpleAdapter);
    }
}