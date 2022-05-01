package com.example.sharedpreferenceskullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import com.example.sharedpreferenceskullanimi.databinding.ActivityMainBinding;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        SharedPreferences sp = getSharedPreferences("bilgiler", MODE_PRIVATE);

        // Veri Kaydı
        SharedPreferences.Editor e = sp.edit();
        e.putString("ad", "Ahmet");
        e.putInt("yas", 23);
        e.putFloat("boy", 1.78f);
        e.putBoolean("bekar", true);

        Set<String> liste = new HashSet<>();
        liste.add("ali");
        liste.add("ece");

        e.putStringSet("liste", liste);

        e.apply();

        // Veri silme
        // e.remove("ad");
        // e.apply();

        // Veri Okuma
        String gelenAd = sp.getString("ad", "isim yok");
        int gelenYas = sp.getInt("yas", 0);
        float gelenBoy = sp.getFloat("boy", 0.0f);
        boolean bekar = sp.getBoolean("bekar", false);
        Set<String> gelenListe = sp.getStringSet("liste", null);

        Log.e("Gelen Ad", gelenAd);
        Log.e("Gelen Yaş", String.valueOf(gelenYas));
        Log.e("Gelen Boy", String.valueOf(gelenBoy));
        Log.e("Gelen Bekar", String.valueOf(bekar));

        for(String a : gelenListe){
            Log.e("Gelen Arladaş", a);
        }

        // Sayaç Uygulaması
        int sayac = sp.getInt("sayac", 0);
        sayac = sayac +1 ;

        e.putInt("sayac", sayac);
        e.apply();

        tasarim.textViewSonuc.setText("Açılış Sayısı: " + sayac);
    }
}