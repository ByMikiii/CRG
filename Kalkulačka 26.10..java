package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
priklad2();
    }
    static void priklad1(){
        System.out.println("Zadajte cislo z ktoreho vypise faktorial: ");
        Scanner myScanner = new Scanner(System.in);
        int cislo = myScanner.nextInt();
        int faktorial = 1;

            for(int i = 1; i <= cislo; i++ ){
                faktorial = i * faktorial;
            }
        System.out.println(faktorial);
        }


        static void priklad2(){
        Scanner sc = new Scanner(System.in);
        boolean app_is_running = true;
        String rozhodnutie;
        double cislo1, cislo2;
        int operacia;
        double vysledok = 0;

        while(app_is_running){

            System.out.println("Zadajte 1. cislo: ");
            cislo1 = sc.nextDouble();

            System.out.println("Zadajte 2. cislo: ");
            cislo2 = sc.nextDouble();

            System.out.println("Zvolte operaciu:");
            System.out.println("1 = +");
            System.out.println("2 = -");
            System.out.println("3 = *");
            System.out.println("4 = :");
            System.out.println("5 = mocnina");


            operacia= sc.nextInt();

            if(operacia == 1){
               vysledok = cislo1 + cislo2;
            } else if(operacia == 2){
                vysledok = cislo1 - cislo2;
            }else if(operacia == 3){
                vysledok = cislo1 * cislo2;
            }else if(operacia == 4){
                vysledok = cislo1 / cislo2;
            }else if(operacia == 5) {
                vysledok = Math.pow(cislo1, 2);
            }else{
                System.out.println("Neznama operacia.");
            }

            System.out.println(vysledok);




            System.out.println("Chcete ukoncit aplikaciu?");
            sc.nextLine();
            rozhodnutie = sc.nextLine();
            if(rozhodnutie.equals("ano")){
                app_is_running = false;
            }

        }
}
          static void priklad3(){


          }
}
