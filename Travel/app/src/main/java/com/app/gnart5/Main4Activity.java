package com.app.gnart5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;


public class Main4Activity extends AppCompatActivity {
    Button btnCheck;
    Button btnReview;
    private ViewPager mPager;
    private ViewPagerAdapter mPagerAdapter;
    private int[] mImageResources = {
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10,
            R.drawable.image11
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        mPager = (ViewPager) findViewById(R.id.viewPager);
        mPagerAdapter = new ViewPagerAdapter(this, mImageResources);
        mPager.setAdapter(mPagerAdapter);

        btnCheck = (Button)findViewById(R.id.buttonCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh21 = new Intent(Main4Activity.this, MainM21Activity.class);
                startActivity(mh21);
            }
        });

        btnReview = (Button)findViewById(R.id.buttonReview);
        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh2 = new Intent(Main4Activity.this, Review.class);
                startActivity(mh2);
            }
        });
    }
}

