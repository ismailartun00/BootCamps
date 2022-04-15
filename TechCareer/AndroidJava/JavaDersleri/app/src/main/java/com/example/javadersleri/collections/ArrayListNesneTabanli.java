package com.example.javadersleri.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNesneTabanli {
    public static void main(String[] args) {
        Ogrenciler o1 = new Ogrenciler(300,"Zeynep","10F");
        Ogrenciler o2 = new Ogrenciler(100,"Beyza","12A");
        Ogrenciler o3 = new Ogrenciler(200,"Ahmet","9C");

        ArrayList<Ogrenciler> ogrencilerListe = new ArrayList<>();
        ogrencilerListe.add(o1);
        ogrencilerListe.add(o2);
        ogrencilerListe.add(o3);

        for(Ogrenciler o:ogrencilerListe){
            System.out.println("No : "+o.getNo()+" - Ad : "+o.getAd()+" - Sınıf : "+o.getSinif());
        }

        System.out.println("*********** Sayısal Küçükten Büyüğe **************");
        Collections.sort(ogrencilerListe,new SayisalKucuktenBuyugeSiralama());
        for(Ogrenciler o:ogrencilerListe){
            System.out.println("No : "+o.getNo()+" - Ad : "+o.getAd()+" - Sınıf : "+o.getSinif());
        }

        System.out.println("*********** Sayısal Büyükten Küçüğe **************");
        Collections.sort(ogrencilerListe,new SayisalBuyuktenKucugeSiralama());
        for(Ogrenciler o:ogrencilerListe){
            System.out.println("No : "+o.getNo()+" - Ad : "+o.getAd()+" - Sınıf : "+o.getSinif());
        }

        System.out.println("*********** Metinsel Küçükten Büyüğe **************");
        Collections.sort(ogrencilerListe,new MetinselKucuktenBuyugeSiralama());
        for(Ogrenciler o:ogrencilerListe){
            System.out.println("No : "+o.getNo()+" - Ad : "+o.getAd()+" - Sınıf : "+o.getSinif());
        }

        System.out.println("*********** Metinsel Büyükten Küçüğe **************");
        Collections.sort(ogrencilerListe,new MetinselBuyuktenKucugeSiralama());
        for(Ogrenciler o:ogrencilerListe){
            System.out.println("No : "+o.getNo()+" - Ad : "+o.getAd()+" - Sınıf : "+o.getSinif());
        }

    }
}
