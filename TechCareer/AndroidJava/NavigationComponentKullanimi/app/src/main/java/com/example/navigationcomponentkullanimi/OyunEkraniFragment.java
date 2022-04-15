package com.example.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentkullanimi.databinding.FragmentOyunEkraniBinding;

public class OyunEkraniFragment extends Fragment {
    private FragmentOyunEkraniBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentOyunEkraniBinding.inflate(inflater, container, false);

        OyunEkraniFragmentArgs bundle = OyunEkraniFragmentArgs.fromBundle(getArguments());
        String gelenAd = bundle.getAd();
        int gelenYas = bundle.getYas();
        float gelenBoy = bundle.getBoy();
        boolean gelenBekar = bundle.getBekar();

        Log.e("Gelen Ad",gelenAd);
        Log.e("Gelen Yaş",String.valueOf(gelenYas));
        Log.e("Gelen Boy",String.valueOf(gelenBoy));
        Log.e("Gelen Bekar",String.valueOf(gelenBekar));

        Kisiler gelenKisi = bundle.getNesne();

        Log.e("Gelen Nesne Ad",gelenKisi.getAd());
        Log.e("Gelen Nesne Yaş",String.valueOf(gelenKisi.getYas()));
        Log.e("Gelen Nesne Boy",String.valueOf(gelenKisi.getBoy()));
        Log.e("Gelen Nesne Bekar",String.valueOf(gelenKisi.isBekar()));

        tasarim.buttonBitir.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sonucEkraninaGecis);
        });

        return tasarim.getRoot();
    }
}