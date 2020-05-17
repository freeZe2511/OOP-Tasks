import java.util.*;

public class ubungMain {

    int erg;
    public static void main(String[] args) {

        abfrageMet();
    }

    static void abfrageMet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe eine Ganzzahlen ein:");
        int zahl = sc.nextInt();

        ifMet(zahl);
    }

    static void ifMet(int zahl) {
        if (zahl == 6 || zahl == 8) {
            System.out.println("Knapp daneben");
            frage();
        }
        else if (zahl == 7) {
            System.out.println("Treffer");
        } else {
            System.out.println("Weit daneben");
            frage();
        }
    }

    static void frage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Willst du nochmal raten? y/n");
        String antwort = sc.next();


        if (antwort.equals("y")) {
            abfrageMet();
        } else {
            System.out.println("Ciao");
        }
    }
}
