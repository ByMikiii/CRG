package com.company;

public class Main {

    public static void main(String[] args) {
Nakladne_auto auto = new Nakladne_auto();

        auto.nalozit(10000);
        auto.nalozit(500);
        auto.vylozit(300);
        auto.vylozit(1000);

        System.out.println("V nakladnom aute je aktualne "+auto.vaha_nakladu+"kg.");
    }
}

_____________________________________________________________________________________________________________________
//Class

package com.company;

public class Nakladne_auto {
    public int vaha_nakladu = 0;
    public int nosnost = 3000;

//Metoda
    public int nalozit(int vaha){
       if(vaha_nakladu + vaha < nosnost && vaha_nakladu + vaha > 0){
           vaha_nakladu = vaha_nakladu + vaha;
            return vaha_nakladu;
       }
       else {return 0;}
    }

    public int vylozit(int vaha){
        if(vaha_nakladu - vaha < nosnost && vaha_nakladu - vaha > 0){
            vaha_nakladu = vaha_nakladu - vaha;
            return vaha_nakladu;
        }
        else {return 0;}
    }
}
