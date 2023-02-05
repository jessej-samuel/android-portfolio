package com.jessejsamuel.portfolio;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class CoursesActivity extends AppCompatActivity {

    ListView courseListView;
    String[] courseTitles = {
            "Statistics for Engineers",
            "Android Programming",
            "Game Programming",
            "Video Analytics",
            "Data Structures",
            "Statistics for Engineers",
            "Android Programming",
            "Game Programming",
            "Video Analytics",
            "Data Structures",
            "Statistics for Engineers",
            "Android Programming",
            "Game Programming",
            "Video Analytics",
            "Data Structures"
    };
    int[] courseIconIds = {
            R.drawable.ic_baseline_calculate_24,
            R.drawable.ic_baseline_android_24,
            R.drawable.ic_baseline_videogame_asset_24,
            R.drawable.ic_baseline_ondemand_video_24,
            R.drawable.ic_baseline_data_object_24,
            R.drawable.ic_baseline_calculate_24,
            R.drawable.ic_baseline_android_24,
            R.drawable.ic_baseline_videogame_asset_24,
            R.drawable.ic_baseline_ondemand_video_24,
            R.drawable.ic_baseline_data_object_24,
            R.drawable.ic_baseline_calculate_24,
            R.drawable.ic_baseline_android_24,
            R.drawable.ic_baseline_videogame_asset_24,
            R.drawable.ic_baseline_ondemand_video_24,
            R.drawable.ic_baseline_data_object_24
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        courseListView = findViewById(R.id.courseList);

        ArrayList<HashMap<String, Object>> courseDataList = new ArrayList<>();

        for (int i = 0; i < courseTitles.length; i++) {
            HashMap<String, Object> dataItem = new HashMap<>();

            dataItem.put("title", courseTitles[i]);
            dataItem.put("icon", courseIconIds[i]);

            courseDataList.add(dataItem);
        }

        String[] from = {"title", "icon"};

        int[] to = {R.id.courseTitle, R.id.courseIcon};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getApplicationContext(), courseDataList, R.layout.course_item, from, to);

        courseListView.setAdapter(simpleAdapter);
    }
}