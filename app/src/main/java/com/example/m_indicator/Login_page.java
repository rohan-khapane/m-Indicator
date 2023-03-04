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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login_page extends AppCompatActivity {
    EditText inputEmail_login,inputPassword_login;
    Button btn_submit_login;
    TextView txt_vw_register_here;



    FirebaseAuth mAuth;
    FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);


        inputEmail_login=findViewById(R.id.ed_username_login);
        inputPassword_login=findViewById(R.id.ed_password_login);
        btn_submit_login=findViewById(R.id.submit_login);
        txt_vw_register_here=findViewById(R.id.txt_vw_register_here);

        mAuth=FirebaseAuth.getInstance();
        mUser=mAuth.getCurrentUser();


        btn_submit_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser();
            }
        });
        txt_vw_register_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_page.this,Signup_page.class));
            }
        });

    }
    private void loginUser(){
        String email=inputEmail_login.getText().toString();
        String password=inputPassword_login.getText().toString();

        if(TextUtils.isEmpty(email)){
            inputEmail_login.setError("Email cannot be empty");
            inputEmail_login.requestFocus();
        }else if(TextUtils.isEmpty(password)) {
            inputPassword_login.setError("Password cannot be empty");
            inputPassword_login.requestFocus();

        }else{
            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(Login_page.this, "User logged in successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Login_page.this,MainActivity.class));
                    }else{
                        Toast.makeText(Login_page.this, "Log in Error:"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        }

}