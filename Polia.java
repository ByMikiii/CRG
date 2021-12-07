package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        priklad1();
    }
    static void priklad1() {
        Scanner myScanner = new Scanner(System.in);
        int[] pole = new int[20];

        int min = 1;
        int max = 50;


        for (int i = 0; i < pole.length; i++) {
            int rand = (int) Math.floor(Math.random() * (max - min + 1) + min);
            pole[i] = rand;
            System.out.println(pole[i]);
        }

        int sucet = 0;
        double priemer;

        for (int i = 0; i < pole.length; i++) {
            sucet = sucet + pole[i];

        }

        priemer = sucet / pole.length;

        Arrays.sort(pole);



        System.out.println();
        System.out.println( "Sucet je:" +sucet);
        System.out.println();
        System.out.println( "Primer je:" +priemer);
        System.out.println();
        System.out.println("Min. hodnota je:" +pole[0]);
        System.out.println("Min. hodnota je:" +pole[19]);


    }
}
