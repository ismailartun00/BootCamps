package com.example.javadersleri.collections;

import java.util.Comparator;

public class MetinselBuyuktenKucugeSiralama implements Comparator<Ogrenciler> {
    @Override
    public int compare(Ogrenciler o1, Ogrenciler o2) {
        return o2.getAd().compareTo(o1.getAd());
    }
}
