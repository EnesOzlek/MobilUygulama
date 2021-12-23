package com.example.dgsmatikkk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Krnm extends AppCompatActivity {

    TextView textView;
    Runnable runnable;
    Handler handler;
    int sayac;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krnm);

        textView=findViewById(R.id.textView2);
        button=findViewById(R.id.button3);
        sayac=0;

    }
    public void baslat(View view) {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                textView.setText("Süre:" + sayac);
                sayac++;
                textView.setText("Süre:" + sayac);
                handler.postDelayed(runnable, 1000);
            }


        };
        handler.post(runnable);
        button.setEnabled(false);

    }
    public void durdur(View view){
        button.setEnabled(true);
        handler.removeCallbacks(runnable);
        sayac=0;
        textView.setText("Süre"+sayac);
    }
}