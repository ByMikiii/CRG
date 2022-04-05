package com.company;

public class Main {

    public static void main(String[] args) {
	Kocka sestkocka = new Kocka(6);
    Kocka desatkocka = new Kocka(10);
    Kocka dvadsatpat = new Kocka(25);
    Kocka kocka = new Kocka();
    Bojovnik bojovnikA = new Bojovnik("Pecoš", 100, 20,10,desatkocka);


        System.out.println(bojovnikA);
        System.out.println("Zije: " + bojovnikA.nazivu());
        System.out.println(bojovnikA.grafickyZivot());

    }
}
