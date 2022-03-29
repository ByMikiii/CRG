package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person bart = new Person("Bart Simpson");

        Person homer = new Person("Homer Simpson");
        Person herb = new Person("Herb Powers");
        Person abraham = new Person("Abraham Simpson");
        Person penelope = new Person("Penelope Olsen");

        Person marge = new Person("Marge Bouvier");
        Person selma = new Person("Selma Bouvier");
        Person pan = new Person("Pan Bouvier");
        Person jackie = new Person("Jackie Bouvier");

        bart.setMatka(marge);
        bart.setOtec(homer);

        homer.setMatka(penelope);
        homer.setOtec(abraham);

        herb.setMatka(penelope);
        herb.setOtec(abraham);

        marge.setMatka(jackie);
        marge.setOtec(pan);

        selma.setMatka(jackie);
        selma.setOtec(pan);

        bart.getRodokmen();
        System.out.println();
        homer.getRodokmen();
    }
}