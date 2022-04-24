package com.example.kisileruygulamasi.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kisileruygulamasi.R;
import com.example.kisileruygulamasi.databinding.FragmentKisiKayitBinding;

public class KisiKayitFragment extends Fragment {
    private FragmentKisiKayitBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentKisiKayitBinding.inflate(inflater, container, false);
        tasarim.toolbarKisiKayit.setTitle("Kişi Kayıt");

        tasarim.buttonKaydet.setOnClickListener(view -> {
            String kisi_ad = tasarim.editTextKisiAd.getText().toString();
            String kisi_tel = tasarim.editTextKisiTel.getText().toString();
            kayit(kisi_ad,kisi_tel);
        });

        return tasarim.getRoot();
    }

    public void kayit(String kisi_ad,String kisi_tel){
        Log.e("Kişi Kayıt",kisi_ad+" - "+kisi_tel);
    }
}