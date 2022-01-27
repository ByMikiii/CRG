package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        priklad1();
    }

    static void priklad1() {
        int[] pole = new int[100000];
        int x = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < pole.length; i++) {
            int random = (int) (Math.random() * 2 + 1);

            if (random == 1) {
                pole[x] = i;
                x++;
            }
        }
        System.out.println("Napiste cislo ktore chcete v poli najst: ");
        int hladane_cislo = sc.nextInt();

        int left_index = 0;
        int left = pole[0];
        int high_index = x-1;
        int high = pole[high_index];
        int stred_index = x/2;
        int stred = pole[stred_index];

        System.out.print("Pole: ");
        for (int j = 0; j < pole.length; j++) {
            if(j <= high_index){
                System.out.print(pole[j] + " ");
            }else if (j > high_index){
                j = pole.length;
            }
        }
        System.out.println();
        System.out.println("Vyberam stred: "+stred);
        if(stred == hladane_cislo){
            System.out.println(stred+" je cislo ktore hladam ");
            System.exit(1);
        }
        else if(stred != hladane_cislo){
            if (stred > hladane_cislo) {
                System.out.println(stred + " nieje cislo ktore hladam");
                System.out.println(stred + " je > ako " + hladane_cislo);
                algoritmus(pole, left_index, left, stred_index, stred, x, hladane_cislo);
            }
            else if (stred < hladane_cislo){
                System.out.println(stred+" nie je cislo ktore hladam");
                System.out.println(stred+" je < ako "+ hladane_cislo );
                algoritmus(pole, stred_index, stred, high_index, high, x, hladane_cislo);
            }

        }
    }

    static void algoritmus(int[] pole, int left_index, int left, int high_index, int high, int x, int hladane_cislo){
        System.out.println();
        System.out.print("Pole: ");
        for (int j = left_index; j < pole.length; j++) {
            if(j <= high_index){
                System.out.print(pole[j] + " ");
            }else if (j > high_index){
                j = pole.length;
            }
        }
        int stred_index;
        if (left_index == 0){
            stred_index = high_index/2;
        }
        else{
            stred_index = (high_index + left_index) /2;
        }
        int stred = pole[stred_index];
        System.out.println();
        System.out.println("Vyberam stred: " +stred);
        if(stred == hladane_cislo){
            System.out.println(stred+" je cislo ktore hladam a je na indexe: "+stred_index);
            System.exit(1);
        }
        else if(stred != hladane_cislo){
            if(left_index+1== high_index){
                System.out.println("Cislo "+hladane_cislo+" sa nenachadza v poli.");
                System.exit(1);
            }
            else if (stred > hladane_cislo) {
                System.out.println(stred + " nieje cislo ktore hladam");
                System.out.println(stred + " je > ako " + hladane_cislo);
                algoritmus(pole, left_index, left, stred_index, stred, x, hladane_cislo);
            }
            else if (stred < hladane_cislo){
                System.out.println(stred+" nie je cislo ktore hladam");
                System.out.println(stred+" je < ako "+ hladane_cislo );
                algoritmus(pole, stred_index, stred, high_index, high, x, hladane_cislo);
            }

        }
    }
}
