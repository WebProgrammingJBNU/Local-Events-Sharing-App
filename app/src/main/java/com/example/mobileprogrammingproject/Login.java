package com.example.mobileprogrammingproject;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.TextView;


public class Login extends AppCompatActivity {
     TextView sign;
     Button login_btn;

     protected void onCreate(Bundle savedInstanceState){
           super.onCreate(savedInstanceState);

           setContentView(R.layout.activity_login);
            //회원가입 버튼
           sign = findViewById(R.id.signin);

            //회원가입 누르면 페이지 이동
           sign.setOnClickListener(v -> {
                Intent intent = new Intent(this, Signup.class);
                startActivity(intent);
           });
           // 로그인 버튼
         login_btn = findViewById(R.id.loginbutton);

         login_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Login.this, MainPageActivity.class);
                 startActivity(intent);
             }
         });
     }
 }