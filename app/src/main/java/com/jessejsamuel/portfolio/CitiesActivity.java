package com.jessejsamuel.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class CitiesActivity extends AppCompatActivity {

    ListView cityListView;

    String[] cityTitles = {"Chennai", "Bangalore","Havelock", "Riyadh"};

    int[] cityImages = {R.drawable.chennai,R.drawable.bangalore,R.drawable.havelock,R.drawable.riyadh};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);

        cityListView = findViewById(R.id.cityList);

        ArrayList<HashMap<String, Object>> citiesData = new ArrayList<>();

        for (int i = 0; i < cityTitles.length; i++) {
            HashMap<String,Object> dataItem = new HashMap<>();
            dataItem.put("title",cityTitles[i]);
            dataItem.put("image", cityImages[i]);
            citiesData.add(dataItem);
        }

        String[] from = {"image","title"};

        int[] to = {R.id.cityImage,R.id.cityTitle};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, citiesData, R.layout.city_card, from, to);
        cityListView.setAdapter(simpleAdapter);
    }
}