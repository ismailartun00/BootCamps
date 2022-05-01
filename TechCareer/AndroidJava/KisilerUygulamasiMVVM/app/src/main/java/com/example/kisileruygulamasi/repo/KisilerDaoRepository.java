package com.example.kisileruygulamasi.repo;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.kisileruygulamasi.entity.Kisiler;

import java.util.ArrayList;
import java.util.List;

public class KisilerDaoRepository {

    private MutableLiveData<List<Kisiler>> kisilerListesi;

    public KisilerDaoRepository() {
        kisilerListesi = new MutableLiveData();
    }

    public MutableLiveData<List<Kisiler>> kisileriGetir(){
        return kisilerListesi;
    }

    public void kisiKayit(String kisi_ad, String kisi_tel){
        Log.e("Kişi Kayıt",kisi_ad+" - "+kisi_tel);
    }

    public void kisiGuncelle(int kisi_id, String kisi_ad, String kisi_tel){
        Log.e("Kişi Güncelle",kisi_id + " - " + kisi_ad + " - " + kisi_tel);
    }

    public void kisiAra(String aramaKelimesi){
        Log.e("Kişi Ara", aramaKelimesi);
    }

    public void kisiSil(int kisi_id){
        Log.e("Kişi Sil", String.valueOf(kisi_id));
    }

    public void tumKisileriAl(){
        ArrayList<Kisiler> liste = new ArrayList<>();

        Kisiler k1 = new Kisiler(1, "Ahmet", "111111");
        Kisiler k2 = new Kisiler(2, "Zeynep", "222222");
        Kisiler k3 = new Kisiler(3, "Beyza", "333333");
        liste.add(k1);
        liste.add(k2);
        liste.add(k3);

        kisilerListesi.setValue(liste);
    }

}
