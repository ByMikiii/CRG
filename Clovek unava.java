package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Clovek clovek = new Clovek();
        clovek.meno = "Karel Novy";
        clovek.vek = 25;

        System.out.println(clovek.meno + " (" +clovek.vek+ ")" );

        clovek.beh(10);
        clovek.beh(10);
        clovek.beh(10);

        clovek.spanok(1);

        clovek.beh(10);
}
}

//Class
package com.company;

import java.util.Random;

public class Clovek {
    String meno;
    int vek;
    private int unava = 0;

    public int getUnava(){
        return unava;
    }

    public int beh(int kilometre){
        if (kilometre + unava > 20){
            System.out.println("Si prilis unaveny na beh");
            return 0;
        }
        for (int i = 0; i < kilometre; i++){
            unava++;
        }
        return unava;
    }

    public int spanok(int hodiny){
        if((hodiny*10) + unava < 0){
            System.out.println("Niesi dostatocne unaveny na spanok");
            return 0;
        }
        else{
        for(int i = 0; i < hodiny; i++){
           unava = unava - 10;}
            return unava;
        }
    }
}
