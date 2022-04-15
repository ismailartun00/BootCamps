package com.example.calismayapisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.calismayapisi.databinding.ActivityOyunEkraniBinding;

public class OyunEkraniActivity extends AppCompatActivity {
    private ActivityOyunEkraniBinding tasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityOyunEkraniBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        String gelenAd = getIntent().getStringExtra("ad");
        int gelenYas = getIntent().getIntExtra("yas",0);
        double gelenBoy = getIntent().getDoubleExtra("boy",0.0);
        boolean gelenBekar = getIntent().getBooleanExtra("bekar",false);

        Log.e("Gelen Ad",gelenAd);
        Log.e("Gelen Yaş",String.valueOf(gelenYas));
        Log.e("Gelen Boy",String.valueOf(gelenBoy));
        Log.e("Gelen Bekar",String.valueOf(gelenBekar));

        Kisiler gelenKisi = (Kisiler) getIntent().getSerializableExtra("nesne");
        Log.e("Gelen Nesne Ad",gelenKisi.getAd());
        Log.e("Gelen Nesne Yaş",String.valueOf(gelenKisi.getYas()));
        Log.e("Gelen Nesne Boy",String.valueOf(gelenKisi.getBoy()));
        Log.e("Gelen Nesne Bekar",String.valueOf(gelenKisi.isBekar()));

        tasarim.buttonBitir.setOnClickListener(view -> {
            Intent intent = new Intent(OyunEkraniActivity.this,SonucEkraniActivity.class);
            startActivity(intent);
            finish();
        });
    }
}