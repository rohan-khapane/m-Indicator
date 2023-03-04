package com.example.m_indicator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Signup_page extends AppCompatActivity {
    ImageView signup_page_img;
    EditText inputEmail,inputPassword;
    Button btn_signup;
    TextView txt_vw_login_here;

    FirebaseAuth mAuth;
    FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);


        signup_page_img=findViewById(R.id.signup_page_img);
        inputEmail=findViewById(R.id.ed_username_signup);
        inputPassword=findViewById(R.id.ed_password_signup);
//        input_conform_password=findViewById(R.id.ed_conform_password_signup);
        btn_signup=findViewById(R.id.btn_signup);
        txt_vw_login_here=findViewById(R.id.txt_vw_login_here);

        mAuth=FirebaseAuth.getInstance();
        mUser=mAuth.getCurrentUser();

        btn_signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                createUser();
            }
        });
        txt_vw_login_here.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Signup_page.this,Login_page.class));
            }
        });
    }
    private void createUser(){
        String email=inputEmail.getText().toString();
        String password=inputPassword.getText().toString();

        if(TextUtils.isEmpty(email)){
            inputEmail.setError("Email cannot be empty");
            inputEmail.requestFocus();
        }else if(TextUtils.isEmpty(password)){
            inputPassword.setError("Password cannot be empty");
            inputPassword.requestFocus();
        }else{
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(Signup_page.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Signup_page.this,Login_page.class));
                    }else{
                        Toast.makeText(Signup_page.this, "Registration Error:"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }




}