package com.example.yemeksiparis.repo;

import androidx.lifecycle.MutableLiveData;

import com.example.yemeksiparis.entity.CRUDCevap;
import com.example.yemeksiparis.entity.SepetYemekler;
import com.example.yemeksiparis.entity.SepetYemeklerCevap;
import com.example.yemeksiparis.entity.Yemekler;
import com.example.yemeksiparis.entity.YemeklerCevap;
import com.example.yemeksiparis.retrofit.ApiUtils;
import com.example.yemeksiparis.retrofit.YemeklerDaoInterface;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class YemeklerDaoRepository {
    private MutableLiveData<List<Yemekler>> yemeklerListesi;
    private MutableLiveData<List<SepetYemekler>> sepetYemeklerListesi;
    private YemeklerDaoInterface ydao;
    private FirebaseAuth auth = FirebaseAuth.getInstance();
    private FirebaseUser currentUser = auth.getCurrentUser();

    public YemeklerDaoRepository() {
        ydao = ApiUtils.getYemeklerDaoInterface();
        yemeklerListesi = new MutableLiveData<>();
        sepetYemeklerListesi = new MutableLiveData<>();
    }

    public MutableLiveData<List<Yemekler>> yemekleriGetir(){
        return yemeklerListesi;
    }

    public MutableLiveData<List<SepetYemekler>> sepetYemekleriGetir(){
        return sepetYemeklerListesi;
    }

    public void tumYemekleriGetir(){
        ydao.tumYemekleriGetir().enqueue(new Callback<YemeklerCevap>() {
            @Override
            public void onResponse(Call<YemeklerCevap> call, Response<YemeklerCevap> response) {
                List<Yemekler> liste = response.body().getYemekler();
                yemeklerListesi.setValue(liste);
            }

            @Override
            public void onFailure(Call<YemeklerCevap> call, Throwable t) {

            }
        });
    }

    public void sepettenYemekSil(int sepet_yemek_id, String kullanici_adi) {
        ydao.sepettenYemekSil(sepet_yemek_id, kullanici_adi).enqueue(new Callback<CRUDCevap>() {
            @Override
            public void onResponse(Call<CRUDCevap> call, Response<CRUDCevap> response) {

            }

            @Override
            public void onFailure(Call<CRUDCevap> call, Throwable t) {

            }
        });
    }

    public void sepeteYemekEkle(String yemek_adi, String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, String kullanici_adi){
        ydao.sepeteYemekEkle(yemek_adi, yemek_resim_adi, yemek_fiyat, yemek_siparis_adet, kullanici_adi).enqueue(new Callback<CRUDCevap>() {
            @Override
            public void onResponse(Call<CRUDCevap> call, Response<CRUDCevap> response) {

            }
            @Override
            public void onFailure(Call<CRUDCevap> call, Throwable t) { }
        });
    }


    public void sepettekiYemekleriGetir(){
        ydao.sepettekiYemekleriGetir(currentUser.getEmail()).enqueue(new Callback<SepetYemeklerCevap>() {
            @Override
            public void onResponse(Call<SepetYemeklerCevap> call, Response<SepetYemeklerCevap> response) {
                sepetYemeklerListesi.setValue(response.body().getSepetYemekler());
            }

            @Override
            public void onFailure(Call<SepetYemeklerCevap> call, Throwable t) {

            }
        });
    }



}
