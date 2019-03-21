package com.example.appmonchis;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        Button btnIngresar = findViewById(R.id.btnIngresar);
        Button btnRegristro = findViewById(R.id.btnRegistro);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,MenuPrincipalActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnRegristro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,MenuRegistro.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
