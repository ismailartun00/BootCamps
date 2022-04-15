package com.example.javadersleri.nesnetabanli1;

public class Araba {
    String renk;
    int hiz;
    boolean calisiyorMu;

    public Araba() {
        System.out.println("Boş constructor çalıştı");
    }

    public Araba(String renk, int hiz, boolean calisiyorMu) {
        this.renk = renk;//Shadowing
        this.hiz = hiz;
        this.calisiyorMu = calisiyorMu;
        System.out.println("Dolu constructor çalıştı");
    }

    public void calistir(){
        calisiyorMu = true;
        hiz = 5;
    }

    public void durdur(){
        calisiyorMu = false;
        hiz = 0;
    }

    public void hizlan(int kacKm){
        hiz = hiz + kacKm;//hiz+=kacKm;
    }

    public void yavasla(int kacKm){
        hiz = hiz - kacKm;
    }

    public void bilgiAl(){
        System.out.println("*************************");
        System.out.println("Renk         : "+renk);
        System.out.println("Hız          : "+hiz);
        System.out.println("Çalışıyor mu : "+calisiyorMu);
    }
}
