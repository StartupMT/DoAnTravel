package com.app.gnart5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainM26Activity extends AppCompatActivity {
    Button btnOther;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_m26);
        btnOther = (Button)findViewById(R.id.buttonOther);
        btnOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh26 = new Intent(MainM26Activity.this, Main3Activity.class);
                startActivity(mh26);
            }
        });
    }
}
