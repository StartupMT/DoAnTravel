package com.app.gnart5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Guest extends AppCompatActivity {
    Button btnResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);
        btnResult = (Button)findViewById(R.id.buttonResult);
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh26 = new Intent(Guest.this, Main3Activity.class);
                startActivity(mh26);
            }
        });
    }

}
