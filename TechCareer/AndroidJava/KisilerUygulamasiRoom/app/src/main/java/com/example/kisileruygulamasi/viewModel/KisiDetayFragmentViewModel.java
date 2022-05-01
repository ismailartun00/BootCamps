package com.example.kisileruygulamasi.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.example.kisileruygulamasi.repo.KisilerDaoRepository;

public class KisiDetayFragmentViewModel extends AndroidViewModel {

    private KisilerDaoRepository krepo;

    public KisiDetayFragmentViewModel(@NonNull Application application) {
        super(application);
        krepo = new KisilerDaoRepository(application);
    }

    public void guncelle(int kisi_id, String kisi_ad, String kisi_tel){
        krepo.kisiGuncelle(kisi_id, kisi_ad, kisi_tel);
    }

}
