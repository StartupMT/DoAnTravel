package com.app.gnart5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

public class Filter extends AppCompatActivity implements ViewTreeObserver.OnScrollChangedListener{
    ScrollView sc;
    Button btnShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        btnShow = (Button)findViewById(R.id.buttonShow);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh3 = new Intent(Filter.this, Main3Activity.class);
                startActivity(mh3);
            }
        });

        sc=(ScrollView)findViewById(R.id.scrollView);
        sc.getViewTreeObserver().addOnScrollChangedListener(this); }
    @Override
    public void onScrollChanged() {
        Toast.makeText(Filter.this,"bạn đã scroll",Toast.LENGTH_SHORT).show();
    }

}
