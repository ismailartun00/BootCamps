package com.example.mvvmkullanimi;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<String> sonuc;
    private MatematikRepository mrepo = new MatematikRepository();

    public MainActivityViewModel() {
        sonuc = mrepo.getMatematikselSonuc();
    }

    public MutableLiveData<String> getSonuc(){
        return sonuc;
    }

    // Side Effect
    public void toplamaYap(String alinanSayi1, String alinanSayi2){
        mrepo.topla(alinanSayi1, alinanSayi2);
    }

    public void carpmaYap(String alinanSayi1, String alinanSayi2){
        mrepo.carp(alinanSayi1, alinanSayi2);
    }
}
