package com.example.javadersleri.ilerijava;

import java.util.ArrayList;

public class TryCatchKullanimi {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("Elma");//0.

        try{
            System.out.println("Sonuç : "+(x / y));
            System.out.println("İşlem Bitti");
            System.out.println("Meyve : "+meyveler.get(2));
        }catch (Exception e){

            if(e instanceof ArithmeticException){
                System.out.println("İkinci sayı sıfır olamaz.");
            }

            if(e instanceof IndexOutOfBoundsException){
                System.out.println("Listenin boyutunu aştınız");
            }
        }
    }
}
