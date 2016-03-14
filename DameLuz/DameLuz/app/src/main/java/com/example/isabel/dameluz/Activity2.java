package com.example.isabel.dameluz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void onClick(View v){
        Intent mIntent = new
        Intent(Activity2.this, Activity1.class);
        startActivity(mIntent);
    }

        }




