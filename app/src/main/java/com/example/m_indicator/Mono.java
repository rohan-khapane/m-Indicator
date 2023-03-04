package com.example.m_indicator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Mono extends AppCompatActivity {
    ListView lv_mono;
    ArrayList<String>mono_stations = new ArrayList<String>();

    Toolbar toolbar_mono;
    RecyclerView rv_mono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mono);

        toolbar_mono=findViewById(R.id.toolbar_mono);
        setSupportActionBar(toolbar_mono);
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);

            getSupportActionBar().setTitle("m-Indicator");
            getSupportActionBar().setSubtitle("Mono");
        }
        rv_mono=findViewById(R.id.rv_mono);
        rv_mono.setLayoutManager(new LinearLayoutManager(this));


        lv_mono=(ListView)findViewById(R.id.lv_mono);
        mono_stations.add("SANT GADGE MAHARAJ CHOWK");
        mono_stations.add("LOWER PAREL");
        mono_stations.add("MINT COLONY");
        mono_stations.add("AMBEDKAR NAGAR");
        mono_stations.add("NAIGAON");
        mono_stations.add("DADAR EAST");
        mono_stations.add("WADALA BRIDGE");
        mono_stations.add("ACHARYA ATRE NAGAR");
        mono_stations.add("ANTOP HILL");
        mono_stations.add("GTB NAGAR");
        mono_stations.add("WADALA DEPOT");
        mono_stations.add("BHAKTI PARK");
        mono_stations.add("MYSORE COLONY");
        mono_stations.add("BHARAT PETROLEUM");
        mono_stations.add("FERTILISER TOWNSHIP");
        mono_stations.add("VNP MARG JUNCTION");
        mono_stations.add("CHEMBUR");


        ArrayAdapter<String> mono_adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mono_stations);
        lv_mono.setAdapter(mono_adapter);


    }
}