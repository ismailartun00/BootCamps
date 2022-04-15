package com.example.toplamamakinesi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.toplamamakinesi.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());


        tasarim.buttonBir.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText() + "1");
        });

        tasarim.buttonIki.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText() + "2");
        });

        tasarim.buttonUc.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText() + "3");
        });

        tasarim.buttonDort.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText() + "4");
        });

        tasarim.buttonBes.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText() + "5");
        });

        tasarim.buttonAlti.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText() + "6");
        });

        tasarim.buttonYedi.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText() + "7");
        });

        tasarim.buttonSekiz.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText() + "8");
        });

        tasarim.buttonDokuz.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText() + "9");
        });

        tasarim.buttonArti.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText() + "+");
        });

        tasarim.buttonSifir.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText() + "0");
        });

        tasarim.buttonEsittir.setOnClickListener(view -> {
            int sonuc = 0;
            String gelenText = tasarim.textViewSonuc.getText().toString();

            String[] tumGelenler = gelenText.split("\\+");

            for(String gelen : tumGelenler){
                sonuc += Integer.parseInt(gelen);
            }

            tasarim.textViewSonuc.setText(String.valueOf(sonuc));
        });

        tasarim.buttonTemizle.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText("");
        });
    }
}