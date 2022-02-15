package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Kocka kockaOsemStranna = new Kocka(8);
        Kocka kockaDesatStranna = new Kocka(10);

        System.out.println(kockaOsemStranna.getPocetStien());
        System.out.println(kockaDesatStranna.getPocetStien());

        System.out.println(kockaOsemStranna.hod(10));
        System.out.println( kockaDesatStranna.hod(10));
}
}


//Class
package com.company;

import java.util.Random;

public class Kocka {
    private Random random;
    private int pocetStien;

    //Konstruktor (prebehne pri starte kodu)
    public Kocka(int novyPocetStien){
        System.out.println("Vytvaram kocku.");
        pocetStien =  novyPocetStien;
        random = new Random();
    }

    //Getter
    public int getPocetStien() {
        return pocetStien;
    }

    //Setter
    public void setPocetStien(int novyPocetStien) {
        pocetStien = novyPocetStien;
    }

    public int hod(int pocetHodov){
        int sucetHodov = 0;
        for (int j = 0; j <pocetHodov; j++ ){
            int i = random.nextInt(pocetStien);
            while(i == 0){
                i = random.nextInt(pocetStien + 1);
            }
            sucetHodov = sucetHodov + i;
        }

        return sucetHodov;
    }
}
