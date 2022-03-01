package com.company;

public class Main {

    public static void main(String[] args) {
        Zviera zviera1 = new Zviera("Miso", "Koala");
        Ohrada ohrada1 = new Ohrada();

        ohrada1.ubytujZviera(zviera1);
        ohrada1.vypisInformaciiOOhradke();

        System.out.println();

        zviera1.unavSa();
        zviera1.unavSa(); //-4
        zviera1.najedzSa();
        zviera1.najedzSa();//+10
        ohrada1.vypisInformaciiOOhradke();

        System.out.println();
        ohrada1.odubytujZviera(zviera1);
        ohrada1.vypisInformaciiOOhradke();

    }
}