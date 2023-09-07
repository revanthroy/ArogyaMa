package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ANCActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ancactivity3);

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
                startActivity(new Intent(ANCActivity3.this,DecisionActivity1.class));
            }
        });

        CardView ANC1 = findViewById(R.id.DIET);
        ANC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANCActivity3.this,HomeActivity2.class));

            }
        });

        CardView ANC2 = findViewById(R.id.EXCERCISE);
        ANC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANCActivity3.this,HomeActivity2.class));

            }
        });

        CardView ANC3 = findViewById(R.id.doctor);
        ANC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANCActivity3.this,HomeActivity2.class));
            }
        });
        CardView ANC4 = findViewById(R.id.lactation);
        ANC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANCActivity3.this,HomeActivity2.class));
            }
        });

        CardView Health = findViewById(R.id.HealthArticles);
        Health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ANCActivity3.this,HealthArticlesActivity.class));
            }
        });
    }
}