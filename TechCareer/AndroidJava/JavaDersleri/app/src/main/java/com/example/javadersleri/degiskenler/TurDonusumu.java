package com.example.javadersleri.degiskenler;

public class TurDonusumu {
    public static void main(String[] args) {
        //Sayısaldan sayısala dönüşüm
        int i = 78;
        double d = 45.67;

        int sonuc1 = (int) d; //explicit
        double sonuc2 = i;//unexplicit
        System.out.println(sonuc1);
        System.out.println(sonuc2);

        //Sayısaldan Metine Dönüşüm
        String sonuc3 = String.valueOf(d);
        String sonuc4 = i + "";
        System.out.println(sonuc3);
        System.out.println(sonuc4);

        //Metiselden Sayısala Dönüşüm
        String yazi1 = "56";
        String yazi2 = "23.85";

        int sonuc5 = Integer.parseInt(yazi1);
        double sonuc6 = Double.parseDouble(yazi2);
        System.out.println(sonuc5);
        System.out.println(sonuc6);
    }
}
