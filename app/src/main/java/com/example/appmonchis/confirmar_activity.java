package com.example.appmonchis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class confirmar_activity extends AppCompatActivity {

    private String card_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_activity);


        Bundle extras = getIntent().getExtras();
        if (extras != null){
            card_title = extras.getString("card_title");
        }

        TextView tvCard_title = (TextView) findViewById(R.id.tvCard_title);
        tvCard_title.setText(card_title);
    }
}
