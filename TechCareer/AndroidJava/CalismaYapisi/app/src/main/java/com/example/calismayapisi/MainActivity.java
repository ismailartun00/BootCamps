package com.example.calismayapisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.calismayapisi.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        tasarim.buttonBasla.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,OyunEkraniActivity.class);
            intent.putExtra("ad","Ahmet");
            intent.putExtra("yas",23);
            intent.putExtra("boy",1.78);
            intent.putExtra("bekar",true);

            Kisiler kisi = new Kisiler("Mehmet",34,1.87,false);
            intent.putExtra("nesne",kisi);

            startActivity(intent);
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Yaşam Döngüsü","onStart çalıştı");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Yaşam Döngüsü","onResume çalıştı");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Yaşam Döngüsü","onPause çalıştı");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Yaşam Döngüsü","onStop çalıştı");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Yaşam Döngüsü","onDestroy çalıştı");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Yaşam Döngüsü","onRestart çalıştı");
    }
}