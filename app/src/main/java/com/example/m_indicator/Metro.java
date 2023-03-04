package com.example.m_indicator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Metro extends AppCompatActivity {
    ListView lv_metro;
    Toolbar toolbar_metro;
    ArrayList<String> metro_stations=new ArrayList<String>();






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro);
        toolbar_metro=findViewById(R.id.toolbar_metro);
        setSupportActionBar(toolbar_metro);


        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);

            getSupportActionBar().setTitle("m-Indicator");
            getSupportActionBar().setSubtitle("Metro");
        }


//        View v = inflater.inflate(R.layout.fragment_station_local_train, container, false);
        lv_metro=(ListView) findViewById(R.id.lv_metro);
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");
        metro_stations.add("Ghatkopar");



        ArrayAdapter metro_adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,metro_stations);
        lv_metro.setAdapter(metro_adapter);




    }
}