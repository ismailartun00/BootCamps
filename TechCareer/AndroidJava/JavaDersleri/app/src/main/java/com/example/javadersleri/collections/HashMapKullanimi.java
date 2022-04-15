package com.example.javadersleri.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapKullanimi {
    public static void main(String[] args) {
        HashMap<Integer,String> iller = new HashMap<>();
        //Veri ekleme
        iller.put(16,"BURSA");
        iller.put(34,"İSTANBUL");
        System.out.println(iller.toString());

        //Güncelleme
        iller.put(16,"YENİ BURSA");
        System.out.println(iller.toString());

        //Veri okuma
        String il = iller.get(34);
        System.out.println("Alınan veri : "+il);

        System.out.println(iller.isEmpty());
        System.out.println(iller.size());

        Set<Integer> anahtarlar = iller.keySet();

        for(Integer a:anahtarlar){
            System.out.println("Sonuç : "+iller.get(a));
        }

        iller.remove(16);
        System.out.println(iller);

        iller.clear();
        System.out.println(iller.toString());
    }
}
