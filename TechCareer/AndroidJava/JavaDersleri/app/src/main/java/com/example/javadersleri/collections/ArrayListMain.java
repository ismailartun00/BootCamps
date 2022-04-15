package com.example.javadersleri.collections;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> meyveler = new ArrayList<String>();
        //Ekleme
        meyveler.add("Muz");//0.
        meyveler.add("Elma");//1.
        meyveler.add("Kiraz");//2.
        System.out.println(meyveler.toString());

        //Güncelleme
        meyveler.set(0,"Yeni Muz");
        System.out.println(meyveler.toString());

        //Insert
        meyveler.add(1,"Portakal");
        System.out.println(meyveler.toString());

        //Veri okuma
        String meyve = meyveler.get(3);
        System.out.println(meyve);

        for(String m:meyveler){
            System.out.println("Sonuç : "+m);
        }

        for(int i=0;i<meyveler.size();i++){
            System.out.println(i+". indeks -> "+meyveler.get(i));
        }

        System.out.println(meyveler.isEmpty());
        System.out.println(meyveler.contains("Elma"));

        meyveler.remove(3);
        System.out.println(meyveler.toString());

        meyveler.clear();
        System.out.println(meyveler.toString());

    }
}
