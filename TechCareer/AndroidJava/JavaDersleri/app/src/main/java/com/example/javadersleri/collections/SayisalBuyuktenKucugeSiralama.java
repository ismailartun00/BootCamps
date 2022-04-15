package com.example.javadersleri.collections;

import java.util.Comparator;

public class SayisalBuyuktenKucugeSiralama implements Comparator<Ogrenciler> {
    @Override
    public int compare(Ogrenciler o1, Ogrenciler o2) {
        return new Integer(o2.getNo()).compareTo(o1.getNo());
    }
}
