package com.example.dgsmatikkk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Geo extends AppCompatActivity {

    String[] TopicsGeo={
            "Geometrik Kavramlar ve Doğruda açılar",
            "Çokgenler ve Dörtgenler",
            "Çember ve Daire",
            "Analitik Geometri",
            "Katı Cisimler"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        ArrayAdapter<String>adapter;
        adapter= new ArrayAdapter<String>(Geo.this, android.R.layout.simple_expandable_list_item_1,TopicsGeo);

        ListView listView =(ListView) findViewById(R.id.geo);
        listView.setAdapter(adapter);

    }
}