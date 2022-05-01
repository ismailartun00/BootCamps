package com.example.kisileruygulamasi.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.kisileruygulamasi.entity.Kisiler;
import com.example.kisileruygulamasi.repo.KisilerDaoRepository;

import java.util.List;

public class AnasayfaFragmentViewModel extends AndroidViewModel {
    private KisilerDaoRepository krepo;
    public MutableLiveData<List<Kisiler>> kisilerListesi = new MutableLiveData();

    public AnasayfaFragmentViewModel(@NonNull Application application) {
        super(application);
        krepo = new KisilerDaoRepository(application);
        kisileriYukle();
        kisilerListesi = krepo.kisileriGetir();
    }

    public void ara(String aramaKelimesi){
        krepo.kisiAra(aramaKelimesi);
    }

    public void sil(int kisi_id){krepo.kisiSil(kisi_id);}

    public void kisileriYukle(){
        krepo.tumKisileriAl();
    }
}
