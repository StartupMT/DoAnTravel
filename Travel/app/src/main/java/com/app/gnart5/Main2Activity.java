package com.app.gnart5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {
    Button btnStay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnStay = (Button)findViewById(R.id.buttonStay);
        btnStay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh3 = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(mh3);
            }
        });
    }

}




