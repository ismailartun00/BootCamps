package com.example.javadersleri.nesnetabanli1;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 odev2 = new Odev2();

        // Soru 1
        System.out.println("----- Soru 1 -----");
        System.out.println(odev2.CelsiusToFahrenheit(20));
        odev2.newLine();

        // Soru 2
        System.out.println("----- Soru 2 -----");
        System.out.println(odev2.CalculatingPerimeterOfRectangle(20, 25));
        odev2.newLine();

        // Soru 3
        System.out.println("----- Soru 3 -----");
        System.out.println(odev2.CalculateFactorial(5));
        odev2.newLine();

        // Soru 4
        System.out.println("----- Soru 4 -----");
        odev2.LetterRepetitionCalculation("merhaba", "a");
        odev2.newLine();

        // Soru 5
        System.out.println("----- Soru 5 -----");
        System.out.println(odev2.SumOfInteriorAnglesByNumberOfSides(5));
        odev2.newLine();

        // Soru 6
        System.out.println("----- Soru 6 -----");
        System.out.println(odev2.salaryCalculation(21));
        odev2.newLine();

        // Soru 7
        System.out.println("----- Soru 7 -----");
        System.out.println(odev2.QuotaAmount(51));
        odev2.newLine();
    }
}
