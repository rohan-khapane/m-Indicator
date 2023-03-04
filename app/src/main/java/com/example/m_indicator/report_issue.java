package com.example.m_indicator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.textfield.TextInputEditText;

public class report_issue extends AppCompatActivity {
    Spinner spinner_report;
    String[] criticality_level={"High","Moderate","Low"};
    androidx.appcompat.widget.Toolbar toolbar_report_issue;
    TextView report_issue_txt;
    EditText first_name_report_txt,last_name_report_txt,email_report_txt,edit_txt_report_issue_comment;
    Button btn_report_issue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_issue);
        first_name_report_txt.findViewById(R.id.first_name_report_txt);
        last_name_report_txt.findViewById(R.id.last_name_report_issue);
        email_report_txt.findViewById(R.id.email_report_txt);
        edit_txt_report_issue_comment.findViewById(R.id.edit_txt_report_issue_comment);
        btn_report_issue.findViewById(R.id.btn_report_issue);
        report_issue_txt.findViewWithTag(R.id.report_an_issue_txt);



        toolbar_report_issue.findViewById(R.id.toolbar_report_issue);
        setSupportActionBar(toolbar_report_issue);
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setTitle("Report an Issue");
        }
        spinner_report=findViewById(R.id.spinner_report_issue);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,criticality_level);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_report.setAdapter(adapter);

//       /
    }
}