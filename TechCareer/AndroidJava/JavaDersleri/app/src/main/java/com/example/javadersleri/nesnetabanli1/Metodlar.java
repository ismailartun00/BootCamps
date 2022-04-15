package com.example.javadersleri.nesnetabanli1;

public class Metodlar {
    //void
    public void selamla(){
        String sonuc = "Merhaba Ahmet";
        System.out.println(sonuc);
    }

    //geri dönüş değeri olan
    public String selamla1(){
        String sonuc = "Merhaba Ahmet";
        return sonuc;
    }

    //parametreli
    public void selamla2(String isim){
        String sonuc = "Merhaba "+isim;
        System.out.println(sonuc);
    }

    public int toplama(int sayi1,int sayi2){
        int toplam = sayi1 + sayi2;
        return  toplam;
    }

    public int toplamHesaplama(int... sayilar){
        int toplam = 0;
        for(int s:sayilar){
            toplam = toplam + s;
        }
        return toplam;
    }

    //overloading
    public void carpma(int sayi1,int sayi2){
        System.out.println("Çarpma : "+(sayi1*sayi2));
    }

    public void carpma(int sayi1,double sayi2){
        System.out.println("Çarpma : "+(sayi1*sayi2));
    }

    public void carpma(double sayi1,int sayi2){
        System.out.println("Çarpma : "+(sayi1*sayi2));
    }
}
