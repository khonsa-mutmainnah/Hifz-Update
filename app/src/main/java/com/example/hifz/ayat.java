package com.example.hifz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ayat extends AppCompatActivity {

    private TextView angka;
    private int a;
    private ImageButton button;
    private ImageButton buttonKlik;
    private Button btn;
    private Button reset;
    private ImageButton next;
    private ImageButton prev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat);

        angka = findViewById(R.id.angka);
        button = findViewById(R.id.next);
        buttonKlik = findViewById(R.id.klik);
        btn = findViewById(R.id.rekam);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);
        prev = findViewById(R.id.previous);

        a = 0;

        buttonKlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tap();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toast();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                next();
            }
        });
    }

    public void tap(){
        a++;
        angka.setText(Integer.toString(a));
    }

    public void reset(){
        a = 0;
        angka.setText(Integer.toString(a));
    }

    public void toast(){
        Toast.makeText(getApplicationContext(), "Good Job!", Toast.LENGTH_SHORT).show();
    }

    public void next(){
        Intent intent = new Intent(ayat.this, Ayat2.class);
        startActivity(intent);
    }

//    @Override
//    protected void onCreate (Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_ayat);
//
//        button = (ImageButton) findViewById(R.id.next);
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                openAyatDua();
//            }
//        });
//    }
//
//    public void openAyatDua(){
//        Intent intent = new Intent(ayat.this, Ayat2.class);
//        startActivity(intent);
//    }
}