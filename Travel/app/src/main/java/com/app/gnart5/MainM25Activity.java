package com.app.gnart5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainM25Activity extends AppCompatActivity {
    Button btnPay;
    Button btnLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_m25);
        btnPay = (Button)findViewById(R.id.buttonPay);
        btnLink = (Button)findViewById(R.id.buttonLink);
        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh26 = new Intent(MainM25Activity.this, MainM26Activity.class);
                startActivity(mh26);
            }
        });
        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh27 = new Intent(MainM25Activity.this, Pay.class);
                startActivity(mh27);
            }
        });
    }
}
