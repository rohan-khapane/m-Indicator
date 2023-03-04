package com.example.m_indicator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class suggest_feature extends AppCompatActivity {
    Spinner spinner_suggest;
    String[] Priority_level={"High","Moderate","Low"};
    androidx.appcompat.widget.Toolbar toolbar_suggest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggest_feature);

        spinner_suggest=findViewById(R.id.spinner_suggest);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Priority_level);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_suggest.setAdapter(adapter);

        spinner_suggest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }

        });
    }
}