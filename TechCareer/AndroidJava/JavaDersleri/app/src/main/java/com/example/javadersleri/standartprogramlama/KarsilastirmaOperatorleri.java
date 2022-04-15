package com.example.javadersleri.standartprogramlama;

public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int s1 = 40;
        int s2 = 50;
        int y1 = 70;
        int y2 = 80;

        System.out.println("s1 == s2 : "+(s1 == s2));
        System.out.println("s1 != s2 : "+(s1 != s2));
        System.out.println("s1 > s2 : "+(s1 > s2));
        System.out.println("s1 >= s2 : "+(s1 >= s2));
        System.out.println("s1 < s2 : "+(s1 < s2));
        System.out.println("s1 <= s2 : "+(s1 <= s2));

        System.out.println(s1 > s2 && y1 > y2);//&& = And = ve , true && true = true
        System.out.println(s1 > s2 || y1 > y2);//|| = Or = veya , false || false = false
    }
}
