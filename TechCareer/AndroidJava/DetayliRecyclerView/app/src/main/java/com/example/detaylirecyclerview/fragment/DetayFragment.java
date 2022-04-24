package com.example.detaylirecyclerview.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.detaylirecyclerview.R;
import com.example.detaylirecyclerview.databinding.FragmentDetayBinding;
import com.example.detaylirecyclerview.entity.Filmler;
import com.google.android.material.snackbar.Snackbar;

public class DetayFragment extends Fragment {
    private FragmentDetayBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentDetayBinding.inflate(inflater, container, false);

        DetayFragmentArgs bundle = DetayFragmentArgs.fromBundle(getArguments());
        Filmler gelenFilm = bundle.getFilm();

        tasarim.toolbarDetay.setTitle(gelenFilm.getFilmAdi());
        tasarim.ivFilmResim.setImageResource(getResources().getIdentifier(gelenFilm.getFilmResimAdi(), "drawable", requireContext().getPackageName()));
        tasarim.tvFilmYonetmen.setText(gelenFilm.getFilmYonetmen());
        tasarim.tvFilmYil.setText(String.valueOf(gelenFilm.getFilmYil()));
        tasarim.tvFilmFiyat.setText(gelenFilm.getFilmFiyat() + " ₺");
        tasarim.btnSepeteEkle.setOnClickListener(view -> {
            Snackbar.make(view, gelenFilm.getFilmAdi() + " " + gelenFilm.getFilmFiyat() + " ₺ fiyatla sepete eklendi", Snackbar.LENGTH_SHORT).show();
        });

        return tasarim.getRoot();
    }
}