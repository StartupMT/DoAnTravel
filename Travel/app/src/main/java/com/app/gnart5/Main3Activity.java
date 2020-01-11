package com.app.gnart5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.Toast;



public class Main3Activity extends AppCompatActivity {
    Button btnHome;
//    Button btnMap;
    Button btnDate;
    Button btnGuest;
    Button btnFit;
    ImageButton imgButtonMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnHome = (Button)findViewById(R.id.buttonHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh4 = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(mh4);
            }
        });

        btnDate = (Button)findViewById(R.id.buttonDate);
        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mhDate = new Intent(Main3Activity.this, Date.class);
                startActivity(mhDate);
            }
        });

        btnGuest = (Button)findViewById(R.id.buttonGuest);
        btnGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mhGuest = new Intent(Main3Activity.this, Guest.class);
                startActivity(mhGuest);
            }
        });

        btnFit = (Button)findViewById(R.id.buttonFit);
        btnFit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mhFit = new Intent(Main3Activity.this, Filter.class);
                startActivity(mhFit);
            }
        });

        imgButtonMap =(ImageButton)findViewById(R.id.imageButtonMap);
        imgButtonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhMap = new Intent(Main3Activity.this, MapsActivity.class);
                startActivity(mhMap);
            }
        });

//        btnMap = (Button) findViewById(R.id.buttonMap);
//        btnMap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent map = new Intent(Main3Activity.this, MapsActivity.class);
//                startActivity(map);
//            }
//        });

    }
}