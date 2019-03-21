package com.example.appmonchis;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class MenuPrincipalActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    EasySlider easySlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        //Activities Desayuno, Almuerzo y cena
        Button btnDesayuno = findViewById(R.id.btnDesayuno);
        Button btnAlmuerzo = findViewById(R.id.btnAlmuerzo);
        Button btnCena = findViewById(R.id.btnCena);

        btnDesayuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipalActivity.this,Desayuno.class);
                startActivity(intent);

            }
        });

        btnAlmuerzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipalActivity.this,Almuerzo.class);
                startActivity(intent);

            }
        });

        btnCena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipalActivity.this,Cena.class);
                startActivity(intent);

            }
        });

        //Slider de imagenes
        easySlider = findViewById(R.id.slider);

        List<SliderItem> easySliders = new ArrayList<>();

        easySliders.add(new SliderItem("Hamburguesa",R.drawable.hamburguesa));
        easySliders.add(new SliderItem("Chifrijo",R.drawable.chifrijo));
        easySliders.add(new SliderItem("Arroz con camarones",R.drawable.arroz));

        easySlider.setPages(easySliders);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);







    }

   @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        Fragment fragment = null;
        String title = "Menu lateral deslizante";

        int id = item.getItemId();


        if (id == R.id.nav_reservar) {
            fragment = new reservar();
            title = "Reservar";
        } else if (id == R.id.nav_comidasRapidas) {
            fragment = new menu();
            title = "Comidas rapidas";

        } else if (id == R.id.nav_menuSemanal) {
            fragment = new menu_semanal();
            title = "Menu semanal";

        } else if (id == R.id.nav_Herramientas) {

        } else if (id == R.id.nav_Buscar) {

        } else if (id == R.id.nav_Enviar) {

        }

        //colocar el fragment elegido

        if(fragment !=null){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.content_frame,fragment);
            fragmentTransaction.commit();
        }

        //poner el titulo
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
