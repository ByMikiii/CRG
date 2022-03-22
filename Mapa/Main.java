package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean appRunning = true;
        String aktualnaLokacia;
        String buducaLokacia = "Hrad";
        Scanner scn = new Scanner(System.in);


        Location castle = new Location("Hrad","Stojíš před okovanou branou gotického hradu, která je zřejmě jediným vchodem do pevnosti.\n" +
                "Klíčová dírka je pokryta pavučinami, což vzbuzuje dojem, že je budova opuštěná.");
        Location forest = new Location("Les", "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n" +
                "slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Location forestPath = new Location("Lesni rozcesti","Nacházíš se na lesním rozcestí.");
        Location forest2 = new Location("Les2", "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n" +
                "slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Location lake = new Location("Rybnik", "Došel jsi ke břehu malého rybníka. Hladina je v bezvětří jako zrcadlo. Kousek\n" +
                "od tebe je dřevěná plošina se stavidlem.");
        Location forest3 = new Location("Les3","Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n" +
                "slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Location house = new Location("Dom", "Stojíš před svým rodným domem, cítíš vůni čerstvě nasekaného dřeva, která se line\n" +
                "z hromady vedle vstupních dveří.");

        castle.setRight(forest);

        forest.setLeft(castle);
        forest.setRight(forestPath);

        forestPath.setLeft(forest);
        forestPath.setDown(forest2);
        forestPath.setRight(forest3);

        forest2.setUp(forestPath);
        forest2.setRight(house);

        forest3.setLeft(forestPath);
        forest3.setRight(lake);

        house.setLeft(forest2);

       lake.setLeft(forest3);

        while(appRunning){
            aktualnaLokacia = buducaLokacia;

            if (aktualnaLokacia.equals("Hrad")){
                castle.getDescription();
            }else if (aktualnaLokacia.equals("Les")){
                forest.getDescription();
            }
            else if (aktualnaLokacia.equals("Les2")){
                forest2.getDescription();
            }
            else if (aktualnaLokacia.equals("Les3")){
                forest3.getDescription();
            }
            else if (aktualnaLokacia.equals("Lesni rozcesti")){
                forestPath.getDescription();
            }
            else if (aktualnaLokacia.equals("Rybnik")){
                lake.getDescription();
            }
            else if (aktualnaLokacia.equals("Dom")){
                house.getDescription();
            }

            System.out.println("Zadaj kam chces ist: (ak chces program ukoncit napis koniec)");
            String pozadovanaLokacia = scn.nextLine();

            if (pozadovanaLokacia.equals("koniec")){
                System.exit(1);
            }

            if(aktualnaLokacia.equals("Hrad")){
                if(pozadovanaLokacia.equals("Les")){
                    buducaLokacia = "Les";
                }else{
                    System.out.println("Tam nemozes ist!");
                }
            }
            if(aktualnaLokacia.equals("Les")){
                if(pozadovanaLokacia.equals("Hrad")){
                    buducaLokacia = "Hrad";
                }else if(pozadovanaLokacia.equals("Lesni rozcesti")) {
                    buducaLokacia = "Lesni rozcesti";
                }else{
                    System.out.println("Tam nemozes ist!");
                }
            }
            if(aktualnaLokacia.equals("Lesni rozcesti")){
                if(pozadovanaLokacia.equals("Les")){
                    buducaLokacia = "Les";
                }else if(pozadovanaLokacia.equals("Les2")) {
                    buducaLokacia = "Les2";
                }else if(pozadovanaLokacia.equals("Les3")) {
                    buducaLokacia = "Les3";
                }else{
                    System.out.println("Tam nemozes ist!");
                }
            }
            if(aktualnaLokacia.equals("Les2")){
                if(pozadovanaLokacia.equals("Lesni rozcesti")){
                    buducaLokacia = "Lesni rozcesti";
                }else if(pozadovanaLokacia.equals("Dom")) {
                    buducaLokacia = "Dom";
                }else{
                    System.out.println("Tam nemozes ist!");
                }
            }
            if(aktualnaLokacia.equals("Dom")){
                if(pozadovanaLokacia.equals("Les2")){
                    buducaLokacia = "Les2";
                }else{
                    System.out.println("Tam nemozes ist!");
                }
            }
            if(aktualnaLokacia.equals("Les3")){
                if(pozadovanaLokacia.equals("Les2")){
                    buducaLokacia = "Les2";
                }if(pozadovanaLokacia.equals("Rybnik")){
                    buducaLokacia = "Rybnik";
                }else{
                    System.out.println("Tam nemozes ist!");
                }
            }
            if(aktualnaLokacia.equals("Rybnik")){
                if(pozadovanaLokacia.equals("Les3")){
                    buducaLokacia = "Les3";
                }else{
                    System.out.println("Tam nemozes ist!");
                }
            }
        }
    }
}