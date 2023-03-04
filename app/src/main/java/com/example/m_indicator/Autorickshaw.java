package com.example.m_indicator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.GridView;



public class Autorickshaw extends AppCompatActivity {
    Toolbar toolbar_auto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autorickshaw);
        toolbar_auto=findViewById(R.id.toolbar_auto);
        setSupportActionBar(toolbar_auto);
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);

            getSupportActionBar().setTitle("m-Indicator");
            getSupportActionBar().setSubtitle("Autorickshaw");
        }



    }
}