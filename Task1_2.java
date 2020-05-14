import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {

        boolean again = true;

        while (again) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bitte Zahlen eingeben: ");
            double zahl1 = sc.nextDouble();
            double zahl2 = sc.nextDouble();
            double summe = zahl1 + zahl2;
            double differenz = zahl1 - zahl2;
            double produkt = zahl1 * zahl2;
            double quotient = zahl1 / zahl2;


            System.out.println("Bitte Rechenoperation auswählen (A, S, M, D): ");
            String ro = sc.next();
            if (ro.equals("A")) {
                System.out.println("Summe: " + summe);
            } else if (ro.equals("S")) {
                System.out.println("Differenz: " + differenz);
            } else if (ro.equals("M")) {
                System.out.println("Produkt: " + produkt);
            } else if (ro.equals("D")) {
                System.out.println("Quotient: " + quotient);
            } else {
                System.out.println("Ungültige Rechenoperation");
            }

            System.out.println("Nochmal? (true/false)");
            again = sc.nextBoolean();

        }


    }
}