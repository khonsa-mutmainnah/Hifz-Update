package com.example.hifz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class surat extends AppCompatActivity {

    TextView surat1;
    TextView surat2;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surat);

        surat1 = findViewById(R.id.surat1);
        surat2 = findViewById(R.id.surat2);
        surat1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAyat();
            }
        });
        surat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTilawah();
            }
        });
    }

    public void openAyat(){
        Intent intent = new Intent(surat.this, ayat.class);
        startActivity(intent);
    }

    public void openTilawah(){
        Intent intent = new Intent(surat.this, ayat_tilawah.class);
        startActivity(intent);
    }

}