package com.example.appmonchis;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuRegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_registro);
        setupActionBar();
    }

    private void setupActionBar(){
        ActionBar actionBar = getSupportActionBar();
        if(actionBar !=null){
            actionBar .setDisplayHomeAsUpEnabled(true);
        }
    }
}
