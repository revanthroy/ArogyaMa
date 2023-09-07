package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ANCActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ancactivity4);

        SharedPreferences sharedPreferences= getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username","").toString();
        Toast.makeText(getApplicationContext(), "Welcome"+username, Toast.LENGTH_SHORT).show();


        CardView exit =findViewById(R.id.CardExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(ANCActivity4.this,DecisionActivity2.class));
            }
        });

        CardView ANC1 = findViewById(R.id.ANC1);
        ANC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANCActivity4.this,HomeActivity2.class));

            }
        });

        CardView ANC2 = findViewById(R.id.ANC2);
        ANC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANCActivity4.this,HomeActivity2.class));

            }
        });

        CardView ANC3 = findViewById(R.id.ANC3);
        ANC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANCActivity4.this,HomeActivity2.class));
            }
        });
        CardView ANC4 = findViewById(R.id.ANC4);
        ANC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANCActivity4.this,HomeActivity2.class));
            }
        });

        CardView Health = findViewById(R.id.HealthArticles);
        Health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANCActivity4.this,HealthArticlesActivity.class));
            }
        });
    }
}