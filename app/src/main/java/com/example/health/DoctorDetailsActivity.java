package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1 =
    {
            {"Doctor Name :Dr.Ramesh", "hospital Address :Kormangala\n  Banglore", "Exp: 10yrs ","Mobile Numbers :9603302777","1000"},
            {"Doctor Name :Dr.JayaPrakash", "hospital Address : JayaNagar\n  Banglore", "Exp: 5yrs ","Mobile Numbers :9347276061","500"},
            {"Doctor Name :Dr.Rajesh", "hospital Address : Majestic\n  Banglore", "Exp: 15yrs ","Mobile Numbers 9515691755","800"},
            {"Doctor Name :Dr.Sunnetha", "hospital Address :Marthanhalli\n  Banglore", "Exp: 10yrs ","Mobile Numbers :8332939894","500"},
            {"Doctor Name :Dr.Nalini", "hospital Address :Yelhanka\n  Banglore", "Exp: 35yrs ","Mobile Numbers :4537534243","800"},
//            {"Doctor Name :Dr.GOPI.R", "hospital Address :Yeswanthpur \n Banglore", "Exp: 6yrs ","Mobile Numbers :8332434542","900"},
//            {"Doctor Name :Dr.Keshav", "hospital Address :Chickbalapur \n Banglore", "Exp: 8yrs ","Mobile Numbers :83322443","999"},
//            {"Doctor Name :Dr.Navin", "hospital Address :Pattangere\n  Banglore", "Exp: 15yrs ","Mobile Numbers :8332523842","1200"},
//            {"Doctor Name :Dr.Anitha", "hospital Address :Kengiri\n  Banglore", "Exp: 20yrs ","Mobile Numbers :94632927691","6000"},
//            {"Doctor Name :Dr.roy", "hospital Address :Hsr Layout\n  Banglore", "Exp: 9yrs ","Mobile Numbers :83341142412","5000"},


    };

    private String[][] doctor_details2 =
            {
//                    {"Doctor Name :Dr.Ramesh", "hospital Address :Kormangala\n  Banglore", "Exp: 10yrs ","Mobile Numbers :9603302777","1000"},
//                    {"Doctor Name :Dr.JayaPrakash", "hospital Address : JayaNagar\n  Banglore", "Exp: 5yrs ","Mobile Numbers :9347276061","500"},
//                    {"Doctor Name :Dr.Rajesh", "hospital Address : Majestic\n  Banglore", "Exp: 15yrs ","Mobile Numbers 9515691755","800"},
//                    {"Doctor Name :Dr.Sunnetha", "hospital Address :Marthanhalli\n  Banglore", "Exp: 10yrs ","Mobile Numbers :8332939894","500"},
//                    {"Doctor Name :Dr.Nalini", "hospital Address :Yelhanka\n  Banglore", "Exp: 35yrs ","Mobile Numbers :4537534243","800"},
                    {"Doctor Name :Dr.GOPI.R", "hospital Address :Yeswanthpur \n Banglore", "Exp: 6yrs ","Mobile Numbers :8332434542","900"},
                    {"Doctor Name :Dr.Keshav", "hospital Address :Chickbalapur \n Banglore", "Exp: 8yrs ","Mobile Numbers :83322443","999"},
                    {"Doctor Name :Dr.Navin", "hospital Address :Pattangere\n  Banglore", "Exp: 15yrs ","Mobile Numbers :8332523842","1200"},
                    {"Doctor Name :Dr.Anitha", "hospital Address :Kengiri\n  Banglore", "Exp: 20yrs ","Mobile Numbers :94632927691","6000"},
                    {"Doctor Name :Dr.roy", "hospital Address :Hsr Layout\n  Banglore", "Exp: 9yrs ","Mobile Numbers :83341142412","5000"},


            };

    private String[][] doctor_details3 =
            {
//                    {"Doctor Name :Dr.Ramesh", "hospital Address :Kormangala\n Banglore", "Exp: 10yrs ","Mobile Numbers :9603302777","1000"},
//                    {"Doctor Name :Dr.JayaPrakash", "hospital Address : JayaNagar\n  Banglore", "Exp: 5yrs ","Mobile Numbers :9347276061","500"},
//                    {"Doctor Name :Dr.Rajesh", "hospital Address : Majestic\n  Banglore", "Exp: 15yrs ","Mobile Numbers 9515691755","800"},
                    {"Doctor Name :Dr.Sunnetha", "hospital Address :Marthanhalli\n  Banglore", "Exp: 10yrs ","Mobile Numbers :8332939894","500"},
                    {"Doctor Name :Dr.Nalini", "hospital Address :Yelhanka\n  Banglore", "Exp: 35yrs ","Mobile Numbers :4537534243","800"},
                    {"Doctor Name :Dr.GOPI.R", "hospital Address :Yeswanthpur\n  Banglore", "Exp: 6yrs ","Mobile Numbers :8332434542","900"},
                    {"Doctor Name :Dr.Keshav", "hospital Address :Chickbalapur\n  Banglore", "Exp: 8yrs ","Mobile Numbers :83322443","999"},
                    {"Doctor Name :Dr.Navin", "hospital Address :Pattangere \n Banglore", "Exp: 15yrs ","Mobile Numbers :8332523842","1200"},
//                    {"Doctor Name :Dr.Anitha", "hospital Address :Kengiri \n Banglore", "Exp: 20yrs ","Mobile Numbers :94632927691","6000"},
//                    {"Doctor Name :Dr.roy", "hospital Address :Hsr Layout \n Banglore", "Exp: 9yrs ","Mobile Numbers :83341142412","5000"},


            };

    private String[][] doctor_details4 =
            {
                    {"Doctor Name :Dr.Ramesh", "hospital Address :Kormangala\n  Banglore", "Exp: 10yrs ","Mobile Numbers :9603302777","1000"},
                    {"Doctor Name :Dr.JayaPrakash", "hospital Address : JayaNagar \n Banglore", "Exp: 5yrs ","Mobile Numbers :9347276061","500"},
                    {"Doctor Name :Dr.Rajesh", "hospital Address : Majestic\n  Banglore", "Exp: 15yrs ","Mobile Numbers 9515691755","800"},
                    {"Doctor Name :Dr.Sunnetha", "hospital Address :Marthanhalli \n Banglore", "Exp: 10yrs ","Mobile Numbers :8332939894","500"},
                    {"Doctor Name :Dr.Nalini", "hospital Address :Yelhanka\n  Banglore", "Exp: 35yrs ","Mobile Numbers :4537534243","800"},
//                    {"Doctor Name :Dr.GOPI.R", "hospital Address :Yeswanthpur\n  Banglore", "Exp: 6yrs ","Mobile Numbers :8332434542","900"},
//                    {"Doctor Name :Dr.Keshav", "hospital Address :Chickbalapur \n Banglore", "Exp: 8yrs ","Mobile Numbers :83322443","999"},
//                    {"Doctor Name :Dr.Navin", "hospital Address :Pattangere\n Banglore", "Exp: 15yrs ","Mobile Numbers :8332523842","1200"},
//                    {"Doctor Name :Dr.Anitha", "hospital Address :Kengiri \n Banglore", "Exp: 20yrs ","Mobile Numbers :94632927691","6000"},
//                    {"Doctor Name :Dr.roy", "hospital Address :Hsr Layout \n Banglore", "Exp: 9yrs ","Mobile Numbers :83341142412","5000"},
//                    {"Doctor Name :K.Ramesh", "hospital Address : Banglore", "Exp: 10yrs ","Mobile Numbers :8332939894","100"},

            };

    private String[][] doctor_details5 =
            {
//                    {"Doctor Name :Dr.Ramesh", "hospital Address :Kormangala Banglore", "Exp: 10yrs ","Mobile Numbers :9603302777","1000"},
//                    {"Doctor Name :Dr.JayaPrakash", "hospital Address : JayaNagarBanglore", "Exp: 5yrs ","Mobile Numbers :9347276061","500"},
//                    {"Doctor Name :Dr.Rajesh", "hospital Address : Majestic Banglore", "Exp: 15yrs ","Mobile Numbers 9515691755","800"},
//                    {"Doctor Name :Dr.Sunnetha", "hospital Address :Marthanhalli Banglore", "Exp: 10yrs ","Mobile Numbers :8332939894","500"},
//                    {"Doctor Name :Dr.Nalini", "hospital Address :Yelhanka Banglore", "Exp: 35yrs ","Mobile Numbers :4537534243","800"},
                    {"Doctor Name :Dr.GOPI.R", "hospital Address :Yeswanthpur Banglore", "Exp: 6yrs ","Mobile Numbers :8332434542","900"},
                    {"Doctor Name :Dr.Keshav", "hospital Address :Chickbalapur  Banglore", "Exp: 8yrs ","Mobile Numbers :83322443","999"},
                    {"Doctor Name :Dr.Navin", "hospital Address :Pattangere Banglore", "Exp: 15yrs ","Mobile Numbers :8332523842","1200"},
                    {"Doctor Name :Dr.Anitha", "hospital Address :Kengiri Banglore", "Exp: 20yrs ","Mobile Numbers :94632927691","6000"},
                    {"Doctor Name :Dr.roy", "hospital Address :Hsr Layout Banglore", "Exp: 9yrs ","Mobile Numbers :83341142412","5000"},


            };
    TextView tv;
    Button btn;
    String [][] doctor_details ={};
    ArrayList List;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv = findViewById(R.id.textViewHATitle);
        btn = findViewById(R.id.buttonBMGoToCart);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("FamilyPhysician") == 0)
            doctor_details = doctor_details1;
        else if (title.compareTo("dentist") == 0)
            doctor_details = doctor_details2;
        else if (title.compareTo("Dietician") == 0)
            doctor_details = doctor_details3;
        else if (title.compareTo("surgeon") == 0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailsActivity.this, FindDoctorActivity.class));
            }
        });

        List = new ArrayList();
        for (int i = 0; i < doctor_details.length; i++) {
            HashMap<String, String> item = new HashMap<String, String>();
            item.put("line1", doctor_details[i][0]);
            item.put("line2", doctor_details[i][1]);
            item.put("line3", doctor_details[i][2]);
            item.put("line4", doctor_details[i][3]);
            item.put("line5", "Cons fees:" + doctor_details[i][4] + "/-");
            List.add(item);
        }
        sa = new SimpleAdapter(this, List,
                R.layout.multi_lines,
                new String[]{"line1", "line2", "line3", "line4", "line5"},
                new int[]{R.id.line_a, R.id.line_b, R.id.line_c, R.id.line_d, R.id.line_e}
        );
        ListView lst = findViewById(R.id.listViewHA);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(DoctorDetailsActivity.this, BookAppointmentActivity.class);
                it.putExtra("text1", title);
                it.putExtra("text2", doctor_details[i][0]);
                it.putExtra("text3", doctor_details[i][1]);
                it.putExtra("text4", doctor_details[i][3]);
                it.putExtra("text5", doctor_details[i][4]);
                startActivity(it);
            }
        });
    }
}