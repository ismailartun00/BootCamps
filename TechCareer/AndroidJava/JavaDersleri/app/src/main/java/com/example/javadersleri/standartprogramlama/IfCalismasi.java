package com.example.javadersleri.standartprogramlama;

public class IfCalismasi {
    public static void main(String[] args) {
        int yas = 17;
        String isim = "Mehmet";

        if(yas >= 18) {
            System.out.println("Reşitsiniz");
        }else{
            System.out.println("Reşit değilsiniz");
        }

        if(isim == "Ahmet"){//isim.equals("Ahmet")
            System.out.println("Merhaba Ahmet");
        }else if (isim == "Mehmet"){
            System.out.println("Merhaba Mehmet");
        }else{
            System.out.println("Tanınmayan kişi");
        }

        String ka = "adminx";
        int sifre = 123456;

        if(ka == "admin" && sifre == 123456){
            System.out.println("Hoşgeldiniz");
        }else{
            System.out.println("Hatalı giriş");
        }

        int sinif = 11;

        if(sinif == 9 || sinif == 10 || sinif == 11 || sinif == 12){
            System.out.println("Lise öğrencisidir");
        }else{
            System.out.println("Lise öğrencisi değildir");
        }
    }
}
