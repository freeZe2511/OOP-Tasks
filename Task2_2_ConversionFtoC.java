import java.util.Scanner;

public class Task2_2_ConversionFtoC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String wdh = "j";

        while(wdh.equals("j")) {

            System.out.println("Temperatur in °F: ");
            double tempf = sc.nextDouble();

            double tempc = (tempf - 32)/1.8;

            System.out.println("Temperatur in °C: " + tempc);
            System.out.println("Neue Berechnung? (j/n)");
            wdh = sc.next();

        }

    }
}
