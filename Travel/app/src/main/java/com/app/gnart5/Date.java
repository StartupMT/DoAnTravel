package com.app.gnart5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Date extends AppCompatActivity {
    Button btnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        btnOk = (Button)findViewById(R.id.buttonOK);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh26 = new Intent(Date.this, Main3Activity.class);
                startActivity(mh26);
            }
        });
    }
}
