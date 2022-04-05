package com.company;

public class Bojovnik {
    private String meno;
    private int zivot;
    private int maxzivot;
    private int utok;
    private int obrana;
    private Kocka kocka;

    public Bojovnik(String meno, int zivot, int utok, int obrana, Kocka kocka) {
        this.meno = meno;
        this.zivot = zivot;
        this.maxzivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.kocka = kocka;
    }

    public boolean nazivu() {
        return (zivot > 0);
    }

    public String grafickyZivot() {
        String s = "[";
        int celkom = 20;
        double pocet = Math.round((double) zivot / maxzivot * celkom);
        System.out.println(zivot);
        System.out.println(pocet);
        if (pocet == 0 && nazivu()) {
            pocet = 1;
        }
        for (int i = 0; i < pocet; i++) {
            s += "#";
        }
        for (int i = 0; i < celkom - pocet; i++) {
            s += " ";
        }
        s += "]";
        return s;
    }

    public String toString() {
        return meno;
    }
}
