package com.example.gittigidiyorappexample.entity;

import java.io.Serializable;

public class Firsatlar implements Serializable {
    private int firsatId;
    private String firsatAd;
    private String firsatResimAd;

    public Firsatlar() {
    }

    public Firsatlar(int firsatId, String firsatAd, String firsatResimAd) {
        this.firsatId = firsatId;
        this.firsatAd = firsatAd;
        this.firsatResimAd = firsatResimAd;
    }

    public int getFirsatId() {
        return firsatId;
    }

    public void setFirsatId(int firsatId) {
        this.firsatId = firsatId;
    }

    public String getFirsatAd() {
        return firsatAd;
    }

    public void setFirsatAd(String firsatAd) {
        this.firsatAd = firsatAd;
    }

    public String getFirsatResimAd(){
        return firsatResimAd;
    }

    public void setFirsatResimAd(String firsatResimAd){
        this.firsatResimAd = firsatResimAd;
    }
}
