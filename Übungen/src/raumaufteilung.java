import java.util.Scanner;

public class raumaufteilung {
    public static void main(String[] args) {

        // x Studis, n Rechner pro Raum

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte Anzahl Studis eingeben: ");
        int studis = sc.nextInt();

        System.out.println("Bitte Anzahl Rechner pro Raum eingeben: ");
        int rechner = sc.nextInt();

        int rooms = studis / rechner;
        int rest = studis % rechner;

        System.out.println("Räume: " + rooms + " Rest: " + rest);



    }
}
