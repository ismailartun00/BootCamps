package com.example.javadersleri.nesnetabanli1;

public class MetodlarMain {
    public static void main(String[] args) {
        Metodlar m = new Metodlar();
        m.selamla();

        String gelenSonuc = m.selamla1();
        System.out.println("Gelen Sonuç : "+gelenSonuc);

        m.selamla2("Mehmet");
        int gelenToplam = m.toplama(10,20);
        System.out.println("Gelen Toplam : "+gelenToplam);

        int hesapSonucu = m.toplamHesaplama(1,2,3,4,5);
        System.out.println("Hesap sonucu : "+hesapSonucu);

        m.carpma(20,5);
    }
}
