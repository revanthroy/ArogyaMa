package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DecisionActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decision1);

        SharedPreferences sharedPreferences= getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        CardView exit =findViewById(R.id.Mother);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(DecisionActivity1.this,ANCActivity3.class));
            }
        });

        CardView exit1 =findViewById(R.id.Child);
        exit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(DecisionActivity1.this,DecisionActivity2.class));
            }
        });

    }}
