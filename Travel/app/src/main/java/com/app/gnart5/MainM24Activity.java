package com.app.gnart5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainM24Activity extends AppCompatActivity {

    Button btnPay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_m24);
        btnPay = (Button)findViewById(R.id.buttonPay);
        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh26 = new Intent(MainM24Activity.this, MainM26Activity.class);
                startActivity(mh26);
            }
        });
    }
}
