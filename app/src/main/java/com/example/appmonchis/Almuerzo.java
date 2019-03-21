package com.example.appmonchis;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class Almuerzo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almuerzo);
        setupActionBar();

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_lidt);
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(R.drawable.burrito,"Almuerzo", R.drawable.splash,25));
        mlist.add(new item(R.drawable.carnita,"Almuerzo", R.drawable.splash,12));
        mlist.add(new item(R.drawable.comidita,"Almuerzo", R.drawable.splash,6));
        mlist.add(new item(R.drawable.pastita,"Almuerzo", R.drawable.splash,9));
        mlist.add(new item(R.drawable.pescadito,"Almuerzo", R.drawable.splash,18));
        mlist.add(new item(R.drawable.hamburgesita,"Almuerzo", R.drawable.splash,22));
        mlist.add(new item(R.drawable.hamburguesitax2,"Almuerzo", R.drawable.splash,13));
        adapter Adapter = new adapter(this,mlist);
        recyclerView.setAdapter(Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private void setupActionBar(){
        ActionBar actionBar = getSupportActionBar();
        if(actionBar !=null){
            actionBar .setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Almuerzos");
        }
    }
}
