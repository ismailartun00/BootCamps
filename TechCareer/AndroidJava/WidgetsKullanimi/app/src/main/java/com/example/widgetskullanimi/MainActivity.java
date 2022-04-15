package com.example.widgetskullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;

import com.example.widgetskullanimi.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        tasarim.buttonResim1.setOnClickListener(view -> {
            tasarim.imageView.setImageResource(R.drawable.resim1);
        });

        tasarim.buttonResim2.setOnClickListener(view -> {
            tasarim.imageView.setImageResource(getResources()
                    .getIdentifier("resim2","drawable",getPackageName()));
        });

        tasarim.switch1.setOnCheckedChangeListener((s,b) -> {
            if(b){
                Log.e("Widgets","Switch : ON");
            }else{
                Log.e("Widgets","Switch : OFF");
            }
        });

        tasarim.checkBoxKotlin.setOnCheckedChangeListener((c,b) -> {
            if(b){
                Log.e("Widgets","Kotlin seçildi");
            }
        });

        tasarim.checkBoxJava.setOnCheckedChangeListener((c,b) -> {
            if(b){
                Log.e("Widgets","Java seçildi");
            }
        });

        tasarim.radioButtonBarcelona.setOnCheckedChangeListener((r,b) -> {
            if(b){
                Log.e("Widgets","Barcelona seçildi");
            }
        });

        tasarim.radioButtonRealmadrid.setOnCheckedChangeListener((r,b) -> {
            if(b){
                Log.e("Widgets","Real Madrid seçildi");
            }
        });

        tasarim.buttonBasla.setOnClickListener(view -> {
            tasarim.progressBar.setVisibility(View.VISIBLE);
        });

        tasarim.buttonDur.setOnClickListener(view -> {
            tasarim.progressBar.setVisibility(View.INVISIBLE);
        });

        tasarim.textViewSonuc.setText(String.valueOf(tasarim.slider.getProgress()));

        tasarim.slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tasarim.textViewSonuc.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

        tasarim.buttonSaat.setOnClickListener(view -> {
            Calendar calendar = Calendar.getInstance();
            int saat = calendar.get(Calendar.HOUR_OF_DAY);
            int dakika = calendar.get(Calendar.MINUTE);

            TimePickerDialog tp = new TimePickerDialog(this, (t, s, dk) -> {
                tasarim.editTextSaat.setText(s + ":" + dk);
            }, saat, dakika, true);

            tp.setButton(DialogInterface.BUTTON_POSITIVE, "Seç", tp);
            tp.setButton(DialogInterface.BUTTON_NEGATIVE, "İptal", tp);

            tp.show();
        });


        tasarim.buttonTarih.setOnClickListener(view -> {
            Calendar calendar = Calendar.getInstance();
            int yil = calendar.get(Calendar.YEAR);
            int ay = calendar.get(Calendar.MONTH);
            int gun = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dp = new DatePickerDialog(this, (d, y, a, g) -> {
                tasarim.editTextTarih.setText(g + "/" + (a+1) + "/" + y);
            }, yil, gun, ay);

            dp.setButton(DialogInterface.BUTTON_POSITIVE, "Seç", dp);
            dp.setButton(DialogInterface.BUTTON_NEGATIVE, "İptal", dp);

            dp.show();
        });

        ArrayList<String> ulkeler = new ArrayList<>();
        ulkeler.add("Türkiye");
        ulkeler.add("İtalya");
        ulkeler.add("Japonya");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, ulkeler);

        tasarim.spinner.setAdapter(adapter);

        tasarim.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Snackbar.make(view, ulkeler.get(position) + " seçildi", Snackbar.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) { }
        });

        tasarim.buttonGoster.setOnClickListener(view -> {
            Log.e("Widgets","Switch en son durum : "+tasarim.switch1.isChecked());
            Log.e("Widgets","Kotlin en son durum : "+tasarim.checkBoxKotlin.isChecked());
            Log.e("Widgets","Java en son durum : "+tasarim.checkBoxJava.isChecked());
            Log.e("Widgets","Barcelona en son durum : "+tasarim.radioButtonBarcelona.isChecked());
            Log.e("Widgets","Real Madrid en son durum : "+tasarim.radioButtonRealmadrid.isChecked());
            Log.e("Widgets","Slider en son durum: " + tasarim.slider.getProgress());
            Log.e("Widgets","En son seçilen ülke: " + ulkeler.get(tasarim.spinner.getSelectedItemPosition()));
        });
    }
}