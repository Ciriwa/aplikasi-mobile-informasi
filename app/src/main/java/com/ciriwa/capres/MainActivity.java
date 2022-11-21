package com.ciriwa.capres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView kontol;
    TextView jembut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kontol = findViewById(R.id.one);
        kontol.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, Berita.class);
            startActivity(i);
        });
        jembut = findViewById(R.id.two);
        jembut.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, Berita2.class);
            startActivity(i);
        });
    }
}