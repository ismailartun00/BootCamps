package com.example.mvvmkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvvmkullanimi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = DataBindingUtil.setContentView(this, R.layout.activity_main);
        tasarim.setMainActivityNesnesi(this);

        tasarim.setHesaplamaSonucu("0");

    }

    public void buttonToplamaTikla(String alinanSayi1, String alinanSayi2){
        int sayi1 = Integer.parseInt(alinanSayi1);
        int sayi2 = Integer.parseInt(alinanSayi2);

        int toplam = sayi1 + sayi2;

        tasarim.setHesaplamaSonucu(String.valueOf(toplam));
    }

    public void buttonCarpmaTikla(String alinanSayi1, String alinanSayi2){
        int sayi1 = Integer.parseInt(alinanSayi1);
        int sayi2 = Integer.parseInt(alinanSayi2);

        int carpim = sayi1 * sayi2;

        tasarim.setHesaplamaSonucu(String.valueOf(carpim));
    }
}