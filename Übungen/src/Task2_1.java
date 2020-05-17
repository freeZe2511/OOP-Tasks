import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {

        double konto = 1000;
        Scanner sc = new Scanner(System.in);

        System.out.println("Einzahlen(E)/ Auszahlen(A)?");
        String action = sc.next();

        if (action.equals("E")){
            System.out.println("Betrag: ");
            double betrag = sc.nextDouble();
            konto = konto + betrag;
            System.out.println("Neuer Kontostand: " + konto + "€");
        }else if(action.equals("A")){
            System.out.println("Betrag: ");
            double betrag = sc.nextDouble();
            if(betrag>konto){
                System.out.println("Nicht genug Guthaben!");
            }else{
                konto = konto - betrag;
                System.out.println("Neuer Kontostand: " + konto + "€");
            }

        }else{
            System.out.println("Ungültige Eingabe");
        }



    }
}
