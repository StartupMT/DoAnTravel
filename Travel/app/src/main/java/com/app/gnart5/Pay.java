package com.app.gnart5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pay extends AppCompatActivity {
    Button btnConfirm;
    ImageButton imgButtonVisa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

//        btnConfirm = (Button)findViewById(R.id.buttonConfirm);
//        btnConfirm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent mh26 = new Intent(Pay.this, MainM25Activity.class);
//                startActivity(mh26);
//            }
//        });

        imgButtonVisa =(ImageButton)findViewById(R.id.imageButtonVisa);
        imgButtonVisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhVisa = new Intent(Pay.this, MainM24Activity.class);
                startActivity(mhVisa);
            }
        });
    }
}
