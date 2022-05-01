package com.example.kisileruygulamasi.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.kisileruygulamasi.entity.Kisiler;
import com.example.kisileruygulamasi.repo.KisilerDaoRepository;

import java.util.List;

public class AnasayfaFragmentViewModel extends ViewModel {
    private KisilerDaoRepository krepo = new KisilerDaoRepository();
    public MutableLiveData<List<Kisiler>> kisilerListesi = new MutableLiveData();

    public AnasayfaFragmentViewModel() {
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
