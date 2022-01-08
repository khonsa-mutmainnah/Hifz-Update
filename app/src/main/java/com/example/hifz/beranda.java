package com.example.hifz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class beranda extends AppCompatActivity {

    private Button button;
    private Button btnMurajaah;
    private Button btnTilawah;
    private Button setAlarm;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        button = (Button) findViewById(R.id.ziyadah);
        btnMurajaah = (Button) findViewById(R.id.murajaah);
        btnTilawah = (Button) findViewById(R.id.tilawah);
        setAlarm = (Button) findViewById(R.id.evaluasi);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSurat();
            }
        });

        btnMurajaah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSurat();
            }
        });

        btnTilawah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSuratTilawah();
            }
        });

        setAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAlarm();
            }
        });
    }

    public void openSurat(){
        Intent intent = new Intent(beranda.this, surat.class);
        startActivity(intent);
    }

    public void openSuratTilawah(){
        Intent intent = new Intent(beranda.this, surat.class);
        startActivity(intent);
    }

    public void openAlarm(){
        Intent intent = new Intent(beranda.this, SetAlarm.class);
        startActivity(intent);
    }
}