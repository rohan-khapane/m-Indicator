package com.example.m_indicator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Penalties_home extends AppCompatActivity {
    Toolbar toolbar_penalties;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penalties_home);
        toolbar_penalties=findViewById(R.id.toolbar_penalties);
        setSupportActionBar(toolbar_penalties);
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);

            getSupportActionBar().setTitle("m-Indicator");
            getSupportActionBar().setSubtitle("Penalties");
        }

    }

}