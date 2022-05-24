package com.example.yemeksiparis.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.yemeksiparis.entity.SepetYemekler;
import com.example.yemeksiparis.repo.YemeklerDaoRepository;

import java.util.List;

public class SepetFragmentVM extends ViewModel {
    private YemeklerDaoRepository yrepo = new YemeklerDaoRepository();
    public MutableLiveData<List<SepetYemekler>> sepetYemeklerListesi = new MutableLiveData<>();

    public SepetFragmentVM() {
        sepettekiYemekleriYukle();
        sepetYemeklerListesi = yrepo.sepetYemekleriGetir();
    }

    public void sepettekiYemekleriYukle(){
        yrepo.sepettekiYemekleriGetir();
    }

    public void sepettenYemekSil(int sepet_yemek_id,String kullanici_adi){
        yrepo.sepettenYemekSil(sepet_yemek_id,kullanici_adi);
    }
}