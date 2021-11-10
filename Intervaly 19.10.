import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        priklad3();
    }

    static void priklad1() {
        System.out.println("Zadaj pocet ryb: ");
        Scanner myScanner = new Scanner(System.in);

        for(int pocetRyb = myScanner.nextInt(); pocetRyb > 0; --pocetRyb) {
            System.out.println("ryba");
        }

    }

    static void priklad2() {
        System.out.println("Zadajte nasobok: ");
        Scanner myScanner = new Scanner(System.in);
        int nasobok = myScanner.nextInt();
        int max = 200;

        for(int nasobok1 = nasobok; nasobok <= max; nasobok += nasobok1) {
            System.out.println(nasobok);
        }

    }

    static void priklad3() {
        System.out.println("Zadajte dolnu medz 1. intervalu: ");
        Scanner myScanner = new Scanner(System.in);
        int interval1Dolna = myScanner.nextInt();
        System.out.println("Zadajte hornu medz 1. intervalu: ");
        int interval1Horna = myScanner.nextInt();
        System.out.println("Zadajte dolnu medz 2. intervalu: ");
        int interval2Dolna = myScanner.nextInt();
        System.out.println("Zadajte hornu medz 2. intervalu: ");
        int interval2Horna = myScanner.nextInt();

        for(int p = interval1Dolna; p <= interval1Horna; ++p) {
            for(int o = interval2Dolna; o <= interval2Horna; ++o) {
                int vysledok = p + o;
                if (vysledok > interval1Dolna && vysledok < interval1Horna) {
                    System.out.print("[" + p + "," + o + "]");
                } else if (vysledok > interval2Dolna && vysledok < interval2Horna) {
                    System.out.print("[" + p + "," + o + "]");
                }
            }
        }

    }
}
