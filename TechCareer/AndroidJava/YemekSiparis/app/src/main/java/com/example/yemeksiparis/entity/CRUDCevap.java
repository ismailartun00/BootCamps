package com.example.yemeksiparis.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CRUDCevap {
    @SerializedName("success")
    @Expose
    private int success;

    @SerializedName("message")
    @Expose
    private String message;

    public CRUDCevap() {
    }

    public CRUDCevap(int success, String message) {
        this.success = success;
        this.message = message;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
