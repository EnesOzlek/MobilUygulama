package com.example.dgsmatikkk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KonuAnlatim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konu_anlatim);
    }

    public void MATEMATİK(View view){
        Intent ıntent = new Intent(getApplicationContext(),MTkon.class);
        startActivity(ıntent);
    }
    public void GEOMETRİ(View view){
        Intent ıntent = new Intent(getApplicationContext(),GEOkon.class);
        startActivity(ıntent);
    }
    public void TÜRKÇE(View view){
        Intent ıntent = new Intent(getApplicationContext(),TRKCkon.class);
        startActivity(ıntent);
    }
}