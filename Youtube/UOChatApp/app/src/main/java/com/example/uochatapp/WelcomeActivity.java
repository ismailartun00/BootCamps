package com.example.uochatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    private Button btnWelcomeLogin, btnWelcomeRegister;

    public void init(){
        btnWelcomeLogin = (Button) findViewById(R.id.btnSignIn);
        btnWelcomeRegister = ( Button) findViewById(R.id.btnSignUp);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();

        btnWelcomeLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLogin = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(intentLogin);
                finish();
            }
        });

        btnWelcomeRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegister = new Intent(WelcomeActivity.this, RegisterActivity.class);
                startActivity(intentRegister);
                finish();
            }
        });
    }
}