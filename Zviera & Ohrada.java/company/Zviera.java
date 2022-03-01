package com.company;

public class Zviera {
    private String meno;
    private String druh;
    private int hlad = 5; //1-10

    public Zviera(String meno, String druh){
        this.meno = meno;
        this.druh = druh;
    }
    public String getDruh() {
        return druh;
    }
    public String getMeno() {
        return meno;
    }
    public int getHlad() {
        return hlad;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }
    public void setDruh(String druh) {
        this.druh = druh;
    }

    public void unavSa(){
        if(hlad >= 2){
            hlad = hlad - 2;
        } else if (hlad < 2){
            System.out.println("Potrebujes sa najest.");
        }
    }

    public void najedzSa(){
        hlad = hlad + 5;
    }
}