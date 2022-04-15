package com.example.navigationcomponentodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentodev.databinding.FragmentAnasayfaBinding;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false);

        tasarim.buttonGoA.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sayfaAGecis);
        });

        tasarim.buttonGoX.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sayfaXGecis);
        });

        return tasarim.getRoot();
    }
}