package com.example.dgsmatikkk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class Denemelerim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denemelerim);

        DatabaseHelper databaseMain = new DatabaseHelper(Denemelerim.this);

        final EditText ad = (EditText) findViewById((R.id.ad));
        final EditText say = (EditText) findViewById((R.id.say));
        final EditText söz = (EditText) findViewById((R.id.söz));

        Button button = (Button) findViewById(R.id.ekle);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                DatabaseHelper databaseMain = new DatabaseHelper(Denemelerim.this);
                databaseMain.VeriEkle(ad.getText().toString(), say.getText().toString(), söz.getText().toString());
            }


        });

        Button listele = (Button) findViewById(R.id.listele);
        final ListView listView = (ListView) findViewById(R.id.veriler);
        listele.setOnClickListener( new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHelper databaseMain = new DatabaseHelper(Denemelerim.this);
                List<String> vVeriler = databaseMain.VeriListele();
                ArrayAdapter<String>adapter= new ArrayAdapter<String>(Denemelerim.this,android.R.layout.simple_list_item_1,android.R.id.text1,vVeriler);

                listView.setAdapter(adapter);
            }
        });
    }
}