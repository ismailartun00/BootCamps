package com.example.uochatapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private Toolbar actionbar;
    private ViewPager vpMain;
    private TabLayout tabsMain;
    private TabsAdapter tabsAdapter;

    private FirebaseAuth auth;
    private FirebaseUser currentUser;

    public void init(){
        actionbar = (Toolbar) findViewById(R.id.actionBar);
        setSupportActionBar(actionbar);
        getSupportActionBar().setTitle(R.string.app_name);

        auth = FirebaseAuth.getInstance();
        currentUser = auth.getCurrentUser();

        vpMain = (ViewPager) findViewById(R.id.vpMain);
        tabsAdapter = new TabsAdapter(getSupportFragmentManager());
        vpMain.setAdapter(tabsAdapter);

        tabsMain = (TabLayout) findViewById(R.id.tabsMain);
        tabsMain.setupWithViewPager(vpMain);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    protected void onStart() {
        if(currentUser == null){
            Intent welcomeIntent = new Intent(MainActivity.this, WelcomeActivity.class);
            startActivity(welcomeIntent);
            finish();
        }

        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.mainLogout){
            auth.signOut();
            Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(loginIntent);
            finish();
        }

        return true;
    }
}