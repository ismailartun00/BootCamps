package com.example.detaylirecyclerview.entity;

import java.io.Serializable;

public class Filmler implements Serializable {
    private int filmId;
    private String filmAdi;
    private String filmResimAdi;
    private int filmYil;
    private double filmFiyat;
    private String filmYonetmen;

    public Filmler() {
    }

    public Filmler(int filmId, String filmAdi, String filmResimAdi, int filmYil, double filmFiyat, String filmYonetmen) {
        this.filmId = filmId;
        this.filmAdi = filmAdi;
        this.filmResimAdi = filmResimAdi;
        this.filmYil = filmYil;
        this.filmFiyat = filmFiyat;
        this.filmYonetmen = filmYonetmen;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public void setFilmAdi(String filmAdi) {
        this.filmAdi = filmAdi;
    }

    public String getFilmResimAdi() {
        return filmResimAdi;
    }

    public void setFilmResimAdi(String filmResimAdi) {
        this.filmResimAdi = filmResimAdi;
    }

    public int getFilmYil() {
        return filmYil;
    }

    public void setFilmYil(int filmYil) {
        this.filmYil = filmYil;
    }

    public double getFilmFiyat() {
        return filmFiyat;
    }

    public void setFilmFiyat(double filmFiyat) {
        this.filmFiyat = filmFiyat;
    }

    public String getFilmYonetmen() {
        return filmYonetmen;
    }

    public void setFilmYonetmen(String filmYonetmen) {
        this.filmYonetmen = filmYonetmen;
    }
}
