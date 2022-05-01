package com.example.todo.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.todo.entity.Yapilacaklar;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;


@Dao
public interface YapilacaklarDao {
    @Query("select * from yapilacaklar")
    Single<List<Yapilacaklar>> tumYapilacaklar();

    @Insert
    Completable yapilacakEkle(Yapilacaklar yapilacak);

    @Update
    Completable yapilacakGuncelle(Yapilacaklar yapilacak);

    @Delete
    Completable yapilacakSil(Yapilacaklar yapilacak);

    @Query("select * from yapilacaklar where yapilacak_is like '%' || :aramaKelimesi || '%'")
    Single<List<Yapilacaklar>> yapilacakArama(String aramaKelimesi);
}
