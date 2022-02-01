package com.company;

public class Main {

    public static void main(String[] args) {
        Ludia clovek1 = new Ludia();
        clovek1.meno="Karol Novak";
        clovek1.vek= 33;
        clovek1.kamarat="Jozef Novy";
        clovek1.predstavenie();

        System.out.println();

        Ludia clovek2 = new Ludia();
        clovek2.meno="Jozef Novy";
        clovek2.vek= 27;
        clovek2.kamarat="Karol Novak";
        clovek2.predstavenie();

    }
}

__________________________________________________________________________________________________________________
//Class

package com.company;

public class Ludia {

    String meno;
    int vek;
    String kamarat;

public void predstavenie() {
    System.out.println("Ahoj, ja som "+ meno+" ,mam rokov "+vek+" a moj kamarat je "+kamarat+".");
}
}

