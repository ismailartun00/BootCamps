package com.example.yemeksiparis.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.yemeksiparis.entity.Yemekler;
import com.example.yemeksiparis.repo.YemeklerDaoRepository;

import java.util.List;

public class AnasayfaFragmentVM extends ViewModel {
    private YemeklerDaoRepository yrepo = new YemeklerDaoRepository();

    public MutableLiveData<List<Yemekler>> yemeklerListesi = new MutableLiveData<>();

    public AnasayfaFragmentVM() {
        yemekleriYukle();
        yemeklerListesi = yrepo.yemekleriGetir();
    }

    public void yemekleriYukle(){
        yrepo.tumYemekleriGetir();
    }

}
