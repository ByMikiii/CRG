package com.company;

import java.util.Random;

public class Kocka {
    private Random random;

    private int pocetStien;

    public Kocka(int pocetSten){
        pocetStien = pocetSten;
        random = new Random();
    }

    public Kocka(){
        pocetStien = 6;
        random = new Random();
    }

    public int vratPocetStien(){
        return pocetStien;
    }

    public int hod(){
        return random.nextInt(pocetStien)+1;
    }
}
