package com.example.javadersleri.nesnetabanli2;

public class OverrideMain {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        Memeli memeli = new Memeli();
        Kedi kedi = new Kedi();
        Kopek kopek = new Kopek();

        hayvan.sesCikar();
        memeli.sesCikar();
        kedi.sesCikar();
        kopek.sesCikar();
    }
}
