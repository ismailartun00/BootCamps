package com.example.mvvmkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvvmkullanimi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        tasarim.setMainActivityNesnesi(this);

        viewModel.getSonuc().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                tasarim.setHesaplamaSonucu(s);
            }
        });

    }

    public void buttonToplamaTikla(String alinanSayi1, String alinanSayi2){
        viewModel.toplamaYap(alinanSayi1, alinanSayi2);
    }

    public void buttonCarpmaTikla(String alinanSayi1, String alinanSayi2){
        viewModel.carpmaYap(alinanSayi1, alinanSayi2);
    }
}