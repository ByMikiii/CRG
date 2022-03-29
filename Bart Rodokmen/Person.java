package com.company;

public class Person {
    private String name;

    private Person matka;
    private Person otec;

    public Person(String name) {
        this.name = name;
    }
    public Person getMatka() {
        return matka;
    }
    public void setMatka(Person matka) {
        this.matka = matka;
    }
    public void setOtec(Person otec) {
        this.otec = otec;
    }
    public Person getOtec() {
        return otec;
    }

    public String getName() {
        return name;
    }

    public void getRodokmen() {
        System.out.println("Rodokmen osoby "+ getName() +": ");
        System.out.println(name);
        if (matka == null && otec == null){
            System.out.println("Tato osoba nema ziadnych rodicov.");
        }else {
            System.out.println(otec.getName());
            if (otec.getMatka() != null){
                System.out.println(otec.otec.name);
                System.out.println(otec.matka.name);
            }

            System.out.println(matka.getName());
            if (matka.getMatka() != null){
                System.out.println(matka.otec.name);
                System.out.println(matka.matka.name);
            }
        }
    }
}

