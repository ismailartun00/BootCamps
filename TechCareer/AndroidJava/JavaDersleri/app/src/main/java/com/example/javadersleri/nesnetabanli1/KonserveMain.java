package com.example.javadersleri.nesnetabanli1;

public class KonserveMain {
    public static void main(String[] args) {
        ucretAl(KonserveBoyut.ORTA,300);
    }

    public static void ucretAl(KonserveBoyut boyut,int adet){
        switch (boyut){
            case KUCUK:
                System.out.println("Ücret : "+(3.4*adet)+" ₺");
                break;
            case ORTA:
                System.out.println("Ücret : "+(4.5*adet)+" ₺");
                break;
            case BUYUK:
                System.out.println("Ücret : "+(7.6*adet)+" ₺");
                break;
        }
    }
}
