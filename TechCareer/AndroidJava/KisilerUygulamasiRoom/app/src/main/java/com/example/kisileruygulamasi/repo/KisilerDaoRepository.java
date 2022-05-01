package com.example.kisileruygulamasi.repo;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.kisileruygulamasi.entity.Kisiler;
import com.example.kisileruygulamasi.room.database.Veritabani;

import java.util.List;

import io.reactivex.CompletableObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class KisilerDaoRepository {

    private MutableLiveData<List<Kisiler>> kisilerListesi;
    private Veritabani vt;

    public KisilerDaoRepository(Application application) {
        kisilerListesi = new MutableLiveData();
        vt = Veritabani.veritabaniErisim(application);
    }

    public MutableLiveData<List<Kisiler>> kisileriGetir(){
        return kisilerListesi;
    }

    public void kisiKayit(String kisi_ad, String kisi_tel){
        Kisiler yeniKisi = new Kisiler(0, kisi_ad, kisi_tel);
        vt.kisilerDao().kisiEkle(yeniKisi)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) { }

                    @Override
                    public void onComplete() {
                        Log.e("Kişi Kayıt", "Başarılı");
                    }

                    @Override
                    public void onError(Throwable e) { }
                });
    }

    public void kisiGuncelle(int kisi_id, String kisi_ad, String kisi_tel){
        Kisiler guncellenenKisi = new Kisiler(kisi_id, kisi_ad, kisi_tel);
        vt.kisilerDao().kisiGuncelle(guncellenenKisi)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) { }

                    @Override
                    public void onComplete() {
                        Log.e("Kişi Güncelleme", "Başarılı");
                    }

                    @Override
                    public void onError(Throwable e) { }
                });
    }

    public void kisiAra(String aramaKelimesi){
        Disposable disposable = vt.kisilerDao().kisiArama(aramaKelimesi)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(liste -> {
                    kisilerListesi.setValue(liste);
                });
    }

    public void kisiSil(int kisi_id){
        Kisiler silinenKisi = new Kisiler(kisi_id, "", "");
        vt.kisilerDao().kisiSil(silinenKisi)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) { }

                    @Override
                    public void onComplete() {
                        Log.e("Kişi Silme", "Başarılı");
                    }

                    @Override
                    public void onError(Throwable e) { }
                });
    }

    public void tumKisileriAl(){
        Disposable disposable = vt.kisilerDao().tumKisiler()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(liste -> {
                    kisilerListesi.setValue(liste);
                });
    }

}
