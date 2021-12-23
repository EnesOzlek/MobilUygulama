package com.example.dgsmatikkk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class turkish extends AppCompatActivity {

    String[] TopicsTurk={"Sözcükte Anlam",
            "Cümlede Anlam",
            "Paragraf",
            "Anlatım Bozuklukları",
            "Sözel Mantık"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkish);

        ArrayAdapter<String>adapter;
        adapter = new ArrayAdapter<String>(turkish.this, android.R.layout.simple_expandable_list_item_1,TopicsTurk);

        ListView listView = (ListView) findViewById(R.id.turk);
        listView.setAdapter(adapter);


    }

}



















