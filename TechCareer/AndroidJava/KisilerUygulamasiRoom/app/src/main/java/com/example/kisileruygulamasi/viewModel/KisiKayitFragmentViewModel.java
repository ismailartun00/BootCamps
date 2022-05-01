package com.example.kisileruygulamasi.viewModel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.example.kisileruygulamasi.repo.KisilerDaoRepository;

public class KisiKayitFragmentViewModel extends AndroidViewModel {

    private KisilerDaoRepository krepo;

    public KisiKayitFragmentViewModel(@NonNull Application application) {
        super(application);
        krepo = new KisilerDaoRepository(application);
    }

    public void kayit(String kisi_ad, String kisi_tel){
        krepo.kisiKayit(kisi_ad, kisi_tel);
    }


}
