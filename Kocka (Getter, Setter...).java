package com.company;

public class Main {

    public static void main(String[] args) {
        Kocka kockaOsemStranna = new Kocka(8);
        Kocka kockaDesatStranna = new Kocka(10);

        System.out.println(kockaOsemStranna.getPocetStien());
        System.out.println(kockaDesatStranna.getPocetStien());

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
}
