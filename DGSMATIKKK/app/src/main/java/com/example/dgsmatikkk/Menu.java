package com.example.dgsmatikkk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void konu(View view) {
        Intent ıntent = new Intent(getApplicationContext(), secenekler.class);
        startActivity(ıntent);
    }

    public void deneme(View view) {
        Intent ıntent = new Intent(getApplicationContext(), Denemelerim.class);
        startActivity(ıntent);
    }

    public void Kronometre(View view) {
        Intent ıntent = new Intent(getApplicationContext(), Krnm.class);
        startActivity(ıntent);
    }

    public void dpnot(View view) {
        Intent ıntent = new Intent(getApplicationContext(), Nthsp.class);
        startActivity(ıntent);

    }

    public void konuanlt(View view) {
        Intent ıntent = new Intent(getApplicationContext(),KonuAnlatim.class);
        startActivity(ıntent);
    }
    public void unı(View view){
        Intent ıntent = new Intent(getApplicationContext(),Uni.class);
        startActivity(ıntent);
    }
}
