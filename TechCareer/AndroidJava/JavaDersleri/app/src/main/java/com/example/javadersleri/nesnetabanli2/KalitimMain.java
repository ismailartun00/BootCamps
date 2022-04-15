package com.example.javadersleri.nesnetabanli2;

public class KalitimMain {
    public static void main(String[] args) {
        Saray topkapiSaray = new Saray();
        topkapiSaray.setKuleSayisi(5);
        topkapiSaray.setPencereSayisi(100);

        System.out.println("Topkapı Saray : "+topkapiSaray.getKuleSayisi());
        System.out.println("Topkapı Saray : "+topkapiSaray.getPencereSayisi());

        Villa bogazVilla = new Villa();
        bogazVilla.setGarajVarmi(true);
        bogazVilla.setPencereSayisi(20);

        System.out.println("Boğaz Villa : "+bogazVilla.isGarajVarmi());
        System.out.println("Boğaz Villa : "+bogazVilla.getPencereSayisi());

        //Upcasting
        Saray saray = new Saray();
        Ev ev = saray;

        //Downcasting
        Ev ev1 = new Ev();
        Saray saray1 = (Saray) ev1;
    }
}
