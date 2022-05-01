package com.example.kisileruygulamasi.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kisileruygulamasi.R;
import com.example.kisileruygulamasi.databinding.FragmentKisiDetayBinding;
import com.example.kisileruygulamasi.entity.Kisiler;
import com.example.kisileruygulamasi.viewModel.KisiDetayFragmentViewModel;

public class KisiDetayFragment extends Fragment {
    private FragmentKisiDetayBinding tasarim;
    private KisiDetayFragmentViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_kisi_detay, container, false);
        tasarim.setKisiDetayFragment(this);
        tasarim.setKisiDetayToolbarBaslik("Kişi Detay");

        KisiDetayFragmentArgs bundle = KisiDetayFragmentArgs.fromBundle(getArguments());
        Kisiler gelenKisi = bundle.getKisi();
        tasarim.setKisiNesnesi(gelenKisi);

        return tasarim.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(KisiDetayFragmentViewModel.class);
    }

    public void buttonGuncelle(int kisi_id, String kisi_ad, String kisi_tel){
            viewModel.guncelle(kisi_id, kisi_ad, kisi_tel);
        }

}