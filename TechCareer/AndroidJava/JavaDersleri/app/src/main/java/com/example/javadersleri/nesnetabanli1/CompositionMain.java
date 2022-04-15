package com.example.javadersleri.nesnetabanli1;

public class CompositionMain {
    public static void main(String[] args) {
        Kategoriler k1 = new Kategoriler(1,"Dram");
        Kategoriler k2 = new Kategoriler(2,"Bilim Kurgu");

        Yonetmenler y1 = new Yonetmenler(1,"Quentin Tarantino");
        Yonetmenler y2 = new Yonetmenler(2,"Christopher Nolan");

        Filmler f1 = new Filmler(1,"Inception",2013,k2,y2);

        System.out.println("Film id : "+f1.getFilm_id());
        System.out.println("Film ad : "+f1.getFilm_ad());
        System.out.println("Film yıl : "+f1.getFilm_yil());
        System.out.println("Film kategori : "+f1.getKategori().getKategori_ad());
        System.out.println("Film yönetmen : "+f1.getYonetmen().getYonetmen_ad());
    }
}
