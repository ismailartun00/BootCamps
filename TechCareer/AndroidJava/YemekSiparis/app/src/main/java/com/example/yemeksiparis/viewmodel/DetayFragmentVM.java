package com.example.yemeksiparis.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.yemeksiparis.repo.YemeklerDaoRepository;

public class DetayFragmentVM extends ViewModel {
    private YemeklerDaoRepository yrepo = new YemeklerDaoRepository();


    public void sepeteYemekEkle(String yemek_adi, String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, String kullanici_adi){
        yrepo.sepeteYemekEkle( yemek_adi, yemek_resim_adi, yemek_fiyat, yemek_siparis_adet, kullanici_adi);
    }
}
