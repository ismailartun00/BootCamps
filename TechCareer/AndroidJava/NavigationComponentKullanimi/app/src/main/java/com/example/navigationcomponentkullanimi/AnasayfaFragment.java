package com.example.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding;
import com.google.android.material.snackbar.Snackbar;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false);

        tasarim.buttonBasla.setOnClickListener(view -> {

            Kisiler kisi = new Kisiler("Mehmet",34,1.87,false);

            AnasayfaFragmentDirections.OyunEkraninaGecis gecis = AnasayfaFragmentDirections.oyunEkraninaGecis(kisi);
            gecis.setAd("Ahmet");
            gecis.setYas(23);
            gecis.setBoy(1.78f);
            gecis.setBekar(true);

            Navigation.findNavController(view).navigate(gecis);
        });

        return tasarim.getRoot();
    }
}