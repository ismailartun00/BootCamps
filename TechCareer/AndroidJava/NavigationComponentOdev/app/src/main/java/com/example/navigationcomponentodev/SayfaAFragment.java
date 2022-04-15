package com.example.navigationcomponentodev;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentodev.databinding.FragmentAnasayfaBinding;
import com.example.navigationcomponentodev.databinding.FragmentSayfaABinding;

public class SayfaAFragment extends Fragment {
    private FragmentSayfaABinding tasarim;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentSayfaABinding.inflate(inflater, container, false);

        tasarim.buttonGoB.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sayfaBGecis);

        });

        return tasarim.getRoot();
    }
}