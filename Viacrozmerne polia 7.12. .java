package com.company;

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

    }
}

