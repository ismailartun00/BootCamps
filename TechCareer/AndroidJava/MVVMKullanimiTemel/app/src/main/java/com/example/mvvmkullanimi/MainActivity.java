package com.example.mvvmkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewSonuc;
    private EditText editTextSayi1, editTextSayi2;
    private Button buttonToplama, buttonCarpma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewSonuc = findViewById(R.id.textViewSonuc);
        editTextSayi1 = findViewById(R.id.editTextSayi1);
        editTextSayi2 = findViewById(R.id.editTextSayi2);
        buttonToplama = findViewById(R.id.buttonToplama);
        buttonCarpma = findViewById(R.id.buttonCarpma);

        textViewSonuc.setText("0");

        buttonToplama.setOnClickListener(view -> {
            String alinanSayi1 = editTextSayi1.getText().toString();
            String alinanSayi2 = editTextSayi2.getText().toString();

            int sayi1 = Integer.parseInt(alinanSayi1);
            int sayi2 = Integer.parseInt(alinanSayi2);

            int toplam = sayi1 + sayi2;

            textViewSonuc.setText(String.valueOf(toplam));
        });

        buttonCarpma.setOnClickListener(view -> {
            String alinanSayi1 = editTextSayi1.getText().toString();
            String alinanSayi2 = editTextSayi2.getText().toString();

            int sayi1 = Integer.parseInt(alinanSayi1);
            int sayi2 = Integer.parseInt(alinanSayi2);

            int carpim = sayi1 * sayi2;

            textViewSonuc.setText(String.valueOf(carpim));
        });
    }
}