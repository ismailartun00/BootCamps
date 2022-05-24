package com.example.yemeksiparis.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class YemeklerCevap {
    @SerializedName("yemekler")
    @Expose
    private List<Yemekler> yemekler;

    @SerializedName("success")
    @Expose
    private int success;

    public YemeklerCevap() {
    }

    public YemeklerCevap(List<Yemekler> yemekler, int success) {
        this.yemekler = yemekler;
        this.success = success;
    }

    public List<Yemekler> getYemekler() {
        return yemekler;
    }

    public void setYemekler(List<Yemekler> yemekler) {
        this.yemekler = yemekler;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }
}
