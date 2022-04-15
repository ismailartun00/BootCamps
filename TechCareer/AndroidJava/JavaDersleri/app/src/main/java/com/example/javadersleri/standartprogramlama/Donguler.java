package com.example.javadersleri.standartprogramlama;

public class Donguler {
    public static void main(String[] args) {
        //3 ile 5 arasında 1 er
        for(int i=3;i<6;i++){
            System.out.println("Döngü 1 : "+i);
        }

        //10 ile 20 5 şer
        //x = x + 5 => x+=5
        for(int x=10;x<21;x+=5){
            System.out.println("Döngü 2 : "+x);
        }

        //20 ile 10 5 şer azalsın
        for(int y=20;y>9;y-=5){
            System.out.println("Döngü 3 : "+y);
        }

        //3 ile 5 arasında 1 er
        int z = 3;
        while (z<6){
            System.out.println("Döngü 4 : "+z);
            z++;
        }

        //1 ile 5
        for(int s=1;s<6;s++){
            if(s==3){
                break;
            }
            System.out.println("Döngü 5 : "+s);
        }

        //1 ile 5
        for(int s=1;s<6;s++){
            if(s==3){
                continue;
            }
            System.out.println("Döngü 6 : "+s);
        }
    }
}
