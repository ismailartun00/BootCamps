package com.example.kisileruygulamasi.viewModel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.kisileruygulamasi.repo.KisilerDaoRepository;

public class KisiKayitFragmentViewModel extends ViewModel {

    private KisilerDaoRepository krepo = new KisilerDaoRepository();

    public void kayit(String kisi_ad, String kisi_tel){
        krepo.kisiKayit(kisi_ad, kisi_tel);
    }


}
