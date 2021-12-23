package com.example.dgsmatikkk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void basla(View view){
        Intent ıntent = new Intent(getApplicationContext(),Menu.class);
        startActivity(ıntent);
    }
}