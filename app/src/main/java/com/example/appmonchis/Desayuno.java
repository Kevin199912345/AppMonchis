package com.example.appmonchis;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Desayuno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desayuno);
        setupActionBar();
    }

    private void setupActionBar(){
        ActionBar actionBar = getSupportActionBar();
        if(actionBar !=null){
            actionBar .setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Cena");
        }
    }
}
