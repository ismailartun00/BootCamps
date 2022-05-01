package com.example.todo.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

@Entity(tableName = "yapilacaklar")
public class Yapilacaklar implements Serializable {
    @NotNull
    @ColumnInfo(name = "yapilacak_id")
    @PrimaryKey(autoGenerate = true)
    private int yapilacak_id;

    @NotNull
    @ColumnInfo(name = "yapilacak_is")
    private String yapilacak_is;

    public Yapilacaklar() {
    }

    public Yapilacaklar(int yapilacak_id, @NotNull String yapilacak_is) {
        this.yapilacak_id = yapilacak_id;
        this.yapilacak_is = yapilacak_is;
    }

    public int getYapilacak_id() {
        return yapilacak_id;
    }

    public void setYapilacak_id(int yapilacak_id) {
        this.yapilacak_id = yapilacak_id;
    }

    @NotNull
    public String getYapilacak_is() {
        return yapilacak_is;
    }

    public void setYapilacak_is(@NotNull String yapilacak_is) {
        this.yapilacak_is = yapilacak_is;
    }
}
