package com.example.yemeksiparis.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Yemekler implements Serializable {
    @SerializedName("yemek_id")
    @Expose
    private int yemek_id;

    @SerializedName("yemek_adi")
    @Expose
    private String yemek_adi;

    @SerializedName("yemek_resim_adi")
    @Expose
    private String yemek_resim_adi;

    @SerializedName("yemek_fiyat")
    @Expose
    private int yemek_fiyat;

    public Yemekler() {
    }

    public Yemekler(int yemek_id, String yemek_adi, String yemek_resim_adi, int yemek_fiyat) {
        this.yemek_id = yemek_id;
        this.yemek_adi = yemek_adi;
        this.yemek_resim_adi = yemek_resim_adi;
        this.yemek_fiyat = yemek_fiyat;
    }

    public int getYemek_id() {
        return yemek_id;
    }

    public void setYemek_id(int yemek_id) {
        this.yemek_id = yemek_id;
    }

    public String getYemek_adi() {
        return yemek_adi;
    }

    public void setYemek_adi(String yemek_adi) {
        this.yemek_adi = yemek_adi;
    }

    public String getYemek_resim_adi() {
        return yemek_resim_adi;
    }

    public void setYemek_resim_adi(String yemek_resim_adi) {
        this.yemek_resim_adi = yemek_resim_adi;
    }

    public int getYemek_fiyat() {
        return yemek_fiyat;
    }

    public void setYemek_fiyat(int yemek_fiyat) {
        this.yemek_fiyat = yemek_fiyat;
    }
}
