package com.example.gittigidiyorappexample.entity;

import java.io.Serializable;

public class Urunler implements Serializable {
    private int urunId;
    private String urunAd;
    private String urunResimAd;
    private String urunKategoriAd;
    private int urunFiyat;

    public Urunler() {
    }

    public Urunler(int urunId, String urunAd, String urunResimAd, String urunKategoriAd, int urunFiyat) {
        this.urunId = urunId;
        this.urunAd = urunAd;
        this.urunResimAd = urunResimAd;
        this.urunKategoriAd = urunKategoriAd;
        this.urunFiyat = urunFiyat;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public String getUrunResimAd() {
        return urunResimAd;
    }

    public void setUrunResimAd(String urunResimAd) {
        this.urunResimAd = urunResimAd;
    }

    public String getUrunKategoriAd() {
        return urunKategoriAd;
    }

    public void setUrunKategoriAd(String urunKategoriAd) {
        this.urunKategoriAd = urunKategoriAd;
    }

    public int getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(int urunFiyat) {
        this.urunFiyat = urunFiyat;
    }
}
