package com.example.javadersleri.collections;

import java.util.Comparator;

public class SayisalKucuktenBuyugeSiralama implements Comparator<Ogrenciler> {
    @Override
    public int compare(Ogrenciler o1, Ogrenciler o2) {
        return new Integer(o1.getNo()).compareTo(o2.getNo());
    }
}
