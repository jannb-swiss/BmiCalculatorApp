package com.example.bmicalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Info extends AppCompatActivity {

    android.widget.Button mstartbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mstartbutton = findViewById(R.id.startbutton);

        mstartbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Info.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}