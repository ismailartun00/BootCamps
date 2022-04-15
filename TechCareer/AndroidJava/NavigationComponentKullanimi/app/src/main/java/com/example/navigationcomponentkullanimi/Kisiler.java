package com.example.navigationcomponentkullanimi;

import java.io.Serializable;

public class Kisiler implements Serializable {
    private String ad;
    private int yas;
    private double boy;
    private boolean bekar;

    public Kisiler() {
    }

    public Kisiler(String ad, int yas, double boy, boolean bekar) {
        this.ad = ad;
        this.yas = yas;
        this.boy = boy;
        this.bekar = bekar;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public boolean isBekar() {
        return bekar;
    }

    public void setBekar(boolean bekar) {
        this.bekar = bekar;
    }
}
