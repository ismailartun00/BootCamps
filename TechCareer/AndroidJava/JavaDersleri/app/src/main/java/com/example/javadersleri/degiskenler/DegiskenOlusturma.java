package com.example.javadersleri.degiskenler;

public class DegiskenOlusturma {
    public static void main(String[] args) {
        String ogrenciAd = "Ahmet";
        int ogrenciYas = 23;
        float ogrenciBoy = 1.78f;
        double ogrenciBoy1 = 1.78;
        char ogrenciBasharf = 'A';
        boolean ogrenciBekar = true;

        System.out.println(ogrenciAd);
        System.out.println(ogrenciYas);
        System.out.println(ogrenciBoy);
        System.out.println(ogrenciBoy1);
        System.out.println(ogrenciBasharf);
        System.out.println(ogrenciBekar);

        int urun_id = 3416;
        String urun_adi = "Kol saati";
        int urun_adet = 100;
        double urun_fiyat = 149.99;
        String urun_tedarikci = "rolex";

        System.out.println("Ürün id : "+urun_id);
        System.out.println("Ürün adı : "+urun_adi);
        System.out.println("Ürün adet : "+urun_adet);
        System.out.println("Ürün fiyat : "+urun_fiyat+" ₺");
        System.out.println("Ürün tedarikçi : "+urun_tedarikci);
    }
}
