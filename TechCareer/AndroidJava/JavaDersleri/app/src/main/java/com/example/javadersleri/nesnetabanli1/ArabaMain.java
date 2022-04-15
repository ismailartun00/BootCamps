package com.example.javadersleri.nesnetabanli1;

public class ArabaMain {
    public static void main(String[] args) {
        Araba bmw = new Araba("Mavi",0,false);
        //Veri aktarma
        //bmw.renk = "Mavi";
        //bmw.hiz = 0;
        //bmw.calisiyorMu = false;

        //Veri Okuma
        bmw.bilgiAl();
        bmw.calistir();
        bmw.bilgiAl();
        bmw.hizlan(50);
        bmw.bilgiAl();
        bmw.yavasla(20);
        bmw.bilgiAl();

        Araba sahin = new Araba("Beyaz",50,true);
        //sahin.renk = "Beyaz";
        //sahin.hiz = 50;
        //sahin.calisiyorMu = true;

        sahin.bilgiAl();
        sahin.durdur();
        sahin.bilgiAl();
        sahin.calistir();
        sahin.bilgiAl();
        sahin.hizlan(40);
        sahin.bilgiAl();
    }
}
