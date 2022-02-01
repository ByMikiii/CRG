package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Kalkulacka kalkulacka = new Kalkulacka();
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj cislo a: ");
    kalkulacka.a = sc.nextInt();
        System.out.println("Zadaj cislo b: ");
    kalkulacka.b = sc.nextInt();

    kalkulacka.scitaj();
    int odcitaj_vysledok = kalkulacka.odcitaj();
        System.out.println("Rozdiel: "+odcitaj_vysledok);
    int vynasob_vysledok = kalkulacka.vynasob();
        System.out.println("Sucin: "+vynasob_vysledok);
    double vydel_vysledok = kalkulacka.vydel();
        System.out.println("Podiel: "+vydel_vysledok);


    }
}

___________________________________________________________________
//Class

package com.company;

public class Kalkulacka {

    public int a;
    public int b;

    public void scitaj(){
        int vysledok = a + b;
        System.out.println("Sucet: "+vysledok);
    }

    public int odcitaj(){
        int vysledok = a - b;
        return vysledok;
    }

    public int vynasob(){
        return a * b;
    }

    public double vydel(){
        if(b == 0){
            System.out.println("Nulou sa delit neda");
            return 0;
        }
        return (double)a / (double)b;
    }

}
