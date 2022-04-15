package com.example.javadersleri.nesnetabanli1;

import androidx.annotation.NonNull;

public class Odev2 {
    public double CelsiusToFahrenheit(@NonNull double celsius){
        return (celsius * 1.8) + 32;
    }

    public int CalculatingPerimeterOfRectangle(@NonNull int a, @NonNull int b){
        return (2*(a+b));
    }

    public int CalculateFactorial(@NonNull int a){
        int factorial = 1;
        if (a == 0 || a == 1){
            factorial = 1;
        }
        for (int i = 1; i <= a; i++){
            factorial *= i;
        }
        return factorial;
    }


    public void LetterRepetitionCalculation(@NonNull String word, @NonNull String letter){
        int numberOfLetters = 0;
        for(int i = 0; i <= word.length() - 1; i++){
            if(word.substring(i, i+1).equals(letter)) {
                numberOfLetters++;
            }
        }
        System.out.println(word + " kelimesinin içerisinde " + letter + " harfi " + numberOfLetters + " defa tekrar etmiştir.");
    }

    public int SumOfInteriorAnglesByNumberOfSides (int numberOfSides){
        return ((numberOfSides - 2 ) * 180);
    }

    public int salaryCalculation (@NonNull int day){
        int hour = day * 8;
        int price;
        if(hour <= 160){
            price = hour * 10;
        }else{
            price = (((day * 8)  - 160) * 20) + 1600;
        }
        return price;
    }

    public int QuotaAmount(@NonNull int quota){
        int price;
        if(quota <= 50){
            price = 100;
        }else{
            quota = (quota - 50) * 4;
            price = 100 + quota;
        }
        return price;
    }

    public void newLine(){
        System.out.println();
    }
}
