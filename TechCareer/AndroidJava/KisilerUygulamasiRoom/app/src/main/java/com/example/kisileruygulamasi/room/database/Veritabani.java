package com.example.kisileruygulamasi.room.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.kisileruygulamasi.entity.Kisiler;
import com.example.kisileruygulamasi.room.dao.KisilerDao;

@Database(entities = {Kisiler.class}, version = 1)
public abstract class Veritabani extends RoomDatabase {
    public abstract KisilerDao kisilerDao();
    public static Veritabani INSTANCE;

    public static Veritabani veritabaniErisim(Context context){
        if (INSTANCE == null){
            synchronized (Veritabani.class){
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        Veritabani.class, "rehber.sqlite")
                        .createFromAsset("rehber.sqlite")
                        .build();
            }
        }
        return INSTANCE;
    }
}