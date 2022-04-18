package com.example.kisileruygulamasi.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kisileruygulamasi.R;
import com.example.kisileruygulamasi.databinding.FragmentKisiDetayBinding;
import com.example.kisileruygulamasi.entity.Kisiler;

public class KisiDetayFragment extends Fragment {
    private FragmentKisiDetayBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        tasarim = FragmentKisiDetayBinding.inflate(inflater, container, false);

        tasarim.toolbarKisiDetay.setTitle("Kişi Detay");

        KisiDetayFragmentArgs bundle = KisiDetayFragmentArgs.fromBundle(getArguments());
        Kisiler gelenKisi = bundle.getKisi();

        tasarim.editTextKisiAd.setText(gelenKisi.getKisi_ad());
        tasarim.editTextKisiTel.setText(gelenKisi.getKisi_tel());

        tasarim.buttonGuncelle.setOnClickListener(view -> {
            String kisi_ad = tasarim.editTextKisiAd.getText().toString();
            String kisi_tel = tasarim.editTextKisiTel.getText().toString();

            guncelle(gelenKisi.getKisi_id(), kisi_ad, kisi_tel);
        });

        return tasarim.getRoot();
    }
        public void guncelle(int kisi_id, String kisi_ad, String kisi_tel){
            Log.e("Kişi Güncelle", kisi_id + " - " + kisi_ad + " - " + kisi_tel);
        }

}