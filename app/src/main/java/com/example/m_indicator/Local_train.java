package com.example.m_indicator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Local_train extends AppCompatActivity {
//    TableLayout tableLayout;
    TabLayout local_tablayout;
    ViewPager local_viewpager;
    androidx.appcompat.widget.Toolbar toolbar2;

    private Object ViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_train);

        toolbar2=findViewById(R.id.toolbar_local_train);
        setSupportActionBar(toolbar2);
//        setSupportActionBar(toolbar2);

        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);

            getSupportActionBar().setTitle("m-Indicator");
            getSupportActionBar().setSubtitle("Local Train");
        }
//        toolbar1.setTitle("m-Indicator");


        Intent intent=getIntent();
        if(intent.getExtras()!=null){
            String selectedname=intent.getStringExtra("name");
            int selectedimg=intent.getIntExtra("image",1);
        }
        local_tablayout=findViewById(R.id.local_tablayout);
        local_viewpager=findViewById(R.id.local_viewpager);

        viewpager_local_adapter adapter=new viewpager_local_adapter(getSupportFragmentManager());
        local_viewpager.setAdapter(adapter);
        local_tablayout.setupWithViewPager(local_viewpager);


    }



    }



