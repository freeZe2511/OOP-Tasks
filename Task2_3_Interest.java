import java.util.Scanner;

public class Task2_3_Interest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float konto = 0;
        float zins = 0;
        int jahr = 0;
        float zinsertrag = 0;

        System.out.println("Geld einzahlen?");
        konto = sc.nextFloat();
        System.out.println("Zinssatz? (%)");
        zins = sc.nextFloat();

        while(jahr < 5){
            jahr +=1;
            zinsertrag = konto * zins/100;
            konto = konto + zinsertrag;
            System.out.println("Jahr: " + jahr + " Kontostand: " + konto + " Zinsertrag: " + zinsertrag);
        }


    }
}
