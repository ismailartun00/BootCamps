package com.example.calismayapisi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.calismayapisi.databinding.ActivitySonucEkraniBinding;
import com.google.android.material.snackbar.Snackbar;

public class SonucEkraniActivity extends AppCompatActivity {
    private ActivitySonucEkraniBinding tasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivitySonucEkraniBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());
    }

    @Override
    public void onBackPressed() {
        Snackbar.make(tasarim.textView3,"Geri dönmek istiyor musunuz ?",Snackbar.LENGTH_LONG)
                .setAction("Evet",view -> {
                    super.onBackPressed();
                })
                .show();
    }
}