package com.company;

public class Main {

    public static void main(String[] args) {
        priklad1();
    }

    static void priklad1() {
        int pocetprvkov = 25;
        int[] pole = new int[25];
        int cislo = 1;
        int x = 0;

        for (int i = 1; i < pocetprvkov; i++) {
            int random = (int) (Math.random() * 2 + 1);

            if (random == 1) {
                pole[x] = i;
                x++;
            }
        }
        for (int j = 0; j < pole.length; j++) {
            System. out. print(pole[j] +" ");
        };

    }
}
