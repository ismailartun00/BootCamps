package com.example.javadersleri.nesnetabanli2;

public class Saray extends Ev {
    private int kuleSayisi;

    public Saray() {
        //super();
        super(10);
    }

    public Saray(int kuleSayisi) {
        this.kuleSayisi = kuleSayisi;
    }

    public int getKuleSayisi() {
        return kuleSayisi;
    }

    public void setKuleSayisi(int kuleSayisi) {
        this.kuleSayisi = kuleSayisi;
    }
}
