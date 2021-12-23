package com.example.dgsmatikkk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class Nthsp extends AppCompatActivity {

    EditText DPNOT;
    Button asd;
    TextView TextView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nthsp);

        DPNOT = (EditText) findViewById(R.id.dpnot);
        asd = (Button) findViewById(R.id.btntopla);
        TextView4 = (TextView) findViewById(R.id.sonuc);


        asd.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int s1 = Integer.parseInt(DPNOT.getText().toString());

                int sonucc = s1 * 5;
                int sonuccc = (int) (sonucc * 0.12);

               TextView4.setText("SONUC"+sonuccc);
            }
        }));

    }
}
