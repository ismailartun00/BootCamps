package com.example.javadersleri.collections;

import java.util.Comparator;

public class MetinselKucuktenBuyugeSiralama implements Comparator<Ogrenciler> {
    @Override
    public int compare(Ogrenciler o1, Ogrenciler o2) {
        return o1.getAd().compareTo(o2.getAd());
    }
}
