package com.example.dgsmatikkk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class secenekler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secenekler);
    }
    public void konu(View view){
        Intent ıntent = new Intent(getApplicationContext(),secenekler.class);
        startActivity(ıntent);
    }
    public void turk(View view){
        Intent ıntent = new Intent(getApplicationContext(),turkish.class);
        startActivity(ıntent);
    }
    public void mat(View view){
        Intent ıntent = new Intent(getApplicationContext(),Mat.class);
        startActivity(ıntent);
    }
    public void geo(View view){
        Intent ıntent = new Intent(getApplicationContext(),Geo.class);
        startActivity(ıntent);
    }
}