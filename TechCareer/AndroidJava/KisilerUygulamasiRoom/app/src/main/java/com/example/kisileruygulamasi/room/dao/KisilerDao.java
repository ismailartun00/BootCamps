package com.example.kisileruygulamasi.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.kisileruygulamasi.entity.Kisiler;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface KisilerDao {
    @Query("select * from kisiler")
    Single<List<Kisiler>> tumKisiler();

    @Insert
    Completable kisiEkle(Kisiler kisi);

    @Update
    Completable kisiGuncelle(Kisiler kisi);

    @Delete
    Completable kisiSil(Kisiler kisi);

    @Query("select * from kisiler where kisi_ad like '%' || :aramaKelimesi || '%'")
    Single<List<Kisiler>> kisiArama(String aramaKelimesi);
}
