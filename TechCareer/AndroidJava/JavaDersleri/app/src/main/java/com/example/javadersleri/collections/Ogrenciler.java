package com.example.javadersleri.collections;

public class Ogrenciler {
    private int no;
    private String ad;
    private String sinif;

    public Ogrenciler() {
    }

    public Ogrenciler(int no, String ad, String sinif) {
        this.no = no;
        this.ad = ad;
        this.sinif = sinif;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
}
