package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

//        SharedPreferences sharedPreferences= getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
//        String username = sharedPreferences.getString("username","").toString();
//        Toast.makeText(getApplicationContext(), "Welcome"+username, Toast.LENGTH_SHORT).show();
//
//        CardView exit =findViewById(R.id.CardExit);
//        exit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                editor.clear();
//                editor.apply();
//                startActivity(new Intent(HomeActivity2.this,LoginActivity2.class));
//            }
//        });

        CardView findDoctor = findViewById(R.id.cardFindDoctor);
        findDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this,FindDoctorActivity.class));

            }
        });
        CardView labTest = findViewById(R.id.cardLabTest);
        labTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this,LabTestActivity.class));

            }
        });
        CardView orderDetails = findViewById(R.id.OrderDetails);
        orderDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this,OrderDetailsActivity.class));
            }
        });
        CardView buyMedicine = findViewById(R.id.cardBuyMedicine);
        buyMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this,BuyMedicineActivity.class));
            }
        });

        CardView Health = findViewById(R.id.Notification);
        Health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(HomeActivity2.this,NotificationActivity2.class));

            }
        });

        CardView Back = findViewById(R.id.CardBack);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this,ANCActivity2.class));
            }
        });
    }}