package com.example.navigationcomponentkullanimi;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.navigationcomponentkullanimi.databinding.BottomKullanimiBinding;
import com.example.navigationcomponentkullanimi.databinding.DrawerKullanimiBinding;

public class MainActivity extends AppCompatActivity {
    private DrawerKullanimiBinding tasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = DrawerKullanimiBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(tasarim.navigationView, navHostFragment.getNavController());

        tasarim.toolbar.setTitle("Başlık");
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, tasarim.drawer, tasarim.toolbar, 0, 0);
        tasarim.drawer.addDrawerListener(toggle);
        toggle.syncState();

        View navigation_baslik = tasarim.navigationView.inflateHeaderView(R.layout.navigation_baslik);
        TextView textViewBaslik = navigation_baslik.findViewById(R.id.textViewBaslik);
        textViewBaslik.setText("Merhaba");
    }

    @Override
    public void onBackPressed() {
        if (tasarim.drawer.isDrawerOpen(GravityCompat.START)){
            tasarim.drawer.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }




    /*
    private BottomKullanimiBinding tasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = BottomKullanimiBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
        NavigationUI.setupWithNavController(tasarim.bottomNav, navHostFragment.getNavController());
    }
     */
}