package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //priklad1();
        priklad2();
    }

    static void priklad1() {
        String[][] array;
        array = new String[5][];
        array[0] = new String []{"██","  ","██","  ","██"};
        array[1] = new String []{"  ","██","  ","██","  "};
        array[2] = new String []{"██","  ","██","  ","██"};
        array[3] = new String []{"  ","██","  ","██","  "};
        array[4] = new String []{"██","  ","██","  ","██"};

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    static void priklad2() {
        String[][] array;
        array = new String[10][10];
        array[0] = new String []{"1"," "," "," "," "," "," "," "," "," "};
        array[1] = new String []{"2"," "," "," "," "," "," "," "," "," "};
        array[2] = new String []{"3"," "," "," "," "," "," "," "," "," "};
        array[3] = new String []{"4"," "," "," "," "," "," "," "," "," "};
        array[4] = new String []{"5"," "," "," "," "," "," "," "," "," "};
        array[5] = new String []{"6"," "," "," "," "," "," "," "," "," "};
        array[6] = new String []{"7"," "," "," "," "," "," "," "," "," "};
        array[7] = new String []{"8"," "," "," "," "," "," "," "," "," "};
        array[8] = new String []{"9"," "," "," "," "," "," "," "," "," "};
        array[9] = new String []{"10"," "," "," "," "," "," "," "," "," "};


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Zadaj kam ches dat X na pozici X: ");
        int xx = myScanner.nextInt();

        System.out.println("Zadaj kam ches dat X na pozici Y: ");
        int xy = myScanner.nextInt() - 1;


        System.out.println("Zadaj kam ches dat O na pozici X: ");
        int ox = myScanner.nextInt();

        System.out.println("Zadaj kam ches dat O na pozici Y: ");
        int oy = myScanner.nextInt() - 1;

        array[xy][xx] = "X";
        array[oy][ox] = "O";

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
