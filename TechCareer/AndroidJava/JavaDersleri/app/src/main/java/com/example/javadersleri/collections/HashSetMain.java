package com.example.javadersleri.collections;

import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> meyveler = new HashSet<>();
        //Veri ekleme
        meyveler.add("Elma");
        meyveler.add("Muz");
        meyveler.add("Kiraz");
        System.out.println(meyveler.toString());

        meyveler.add("Amasya Elması");
        System.out.println(meyveler.toString());

        System.out.println(meyveler.isEmpty());
        System.out.println(meyveler.size());

        for(String m:meyveler){
            System.out.println("Sonuç : "+m);
        }

        meyveler.remove("Muz");
        System.out.println(meyveler.toString());

        meyveler.clear();
        System.out.println(meyveler.toString());
    }
}
