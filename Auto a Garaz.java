//Main
package com.company;

public class Main {

    public static void main(String[] args) {
        Auto auto1 = new Auto("CA-83K2D", "Zlta");

        Garaz garaz1 = new Garaz();
        garaz1.zaparkuj(auto1);
        garaz1.vypisAutovGarazi();
        System.out.println();
        garaz1.vyparkuj();
        garaz1.vypisAutovGarazi();
}
}

//CLASS AUTO
package com.company;

public class Auto {
    private String spz;
    private String color;

    public Auto(String spz, String color) {
        this.spz = spz;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getspz() {
        return color;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }
}

//CLASS GARAZ
package com.company;

public class Garaz {
    private Auto parkedCar;

    public Auto getParkedCar() {
        return parkedCar;
    }

    public void zaparkuj(Auto parkedCar){
        this.parkedCar = parkedCar;
    }

    public void vypisAutovGarazi(){
        if(this.parkedCar == null){
            System.out.println("V garazi nie je ziadne auto.");
            return;
        }
        System.out.println("V garazi je auto s spz: " + this.parkedCar.getspz());
        System.out.println("V garazi je auto s farbou: " + this.parkedCar.getColor());

    }
    public void vyparkuj(){
        this.parkedCar = null;
    }
}
