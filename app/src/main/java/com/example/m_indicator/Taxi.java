package com.example.m_indicator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Taxi extends AppCompatActivity {
    ListView lv_taxifare;
    ArrayList<String>taxi_fare=new ArrayList<>();
    Toolbar toolbar_taxi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxi);
        toolbar_taxi=findViewById(R.id.toolbar_taxi);
        setSupportActionBar(toolbar_taxi);
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);

            getSupportActionBar().setTitle("m-Indicator");
            getSupportActionBar().setSubtitle("Taxi");
        }

     lv_taxifare=(ListView)findViewById(R.id.lv_taxi_fare);
//        lv_taxifare.getTextAlignment(20zsp);
        taxi_fare.add("Km   Dayfare   night fare");
        taxi_fare.add("1.5   22   25");
        taxi_fare.add("1.5");
        taxi_fare.add("1.5");

        ArrayAdapter<String> lv_taxi_fare=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,taxi_fare);
        lv_taxifare.setAdapter(lv_taxi_fare);

    }
}