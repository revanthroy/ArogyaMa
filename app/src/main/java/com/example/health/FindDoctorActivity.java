package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FindDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);


        CardView exit = findViewById(R.id.CardExit);
        exit.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view) {
                startActivity(new Intent(FindDoctorActivity.this,HomeActivity2.class));
        }
        });


        CardView  FamilyPhysician= findViewById(R.id.cardFDFamilyPhysician);
        FamilyPhysician.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent it = (new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class));
                it.putExtra("title","Family Physicians");
                startActivity(it);
            }
        });

        CardView dentist= findViewById(R.id.cardFDdentist);
        dentist.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent it = (new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class));
                it.putExtra("title","dentist");
                startActivity(it);
            }
        });

        CardView Dietician= findViewById(R.id.cardFDDietician);
        Dietician.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent it = (new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class));
                it.putExtra("title","Dietician");
                startActivity(it);
            }
        });

        CardView surgeon= findViewById(R.id.cardFDsurgeon);
        surgeon.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent it = (new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class));
                it.putExtra("title","surgeon");
                startActivity(it);
            }
        });

        CardView cardiologists= findViewById(R.id.cardcardiologists);
        cardiologists.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent it = (new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class));
                it.putExtra("title","cardiologists");
                startActivity(it);
            }
        });
    }}