package com.app.gnart5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainM23Activity extends AppCompatActivity {
    ScrollView sc;
    Button btnReserve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_m23);
        btnReserve = (Button)findViewById(R.id.buttonReserve);
        btnReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh2 = new Intent(MainM23Activity.this, MainM25Activity.class);
                startActivity(mh2);
            }
        });

    }
}
