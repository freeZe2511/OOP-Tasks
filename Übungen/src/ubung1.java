import java.util.Scanner;

public class ubung1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean again = true;

        while (again){
            System.out.println("Bitte Zahl eingeben: ");
            int zahl = sc.nextInt();

            if (zahl == 6 || zahl == 8) {
                System.out.println("Knapp daneben");
            }else if (zahl == 7){
                System.out.println("Treffer");
            }else {
                System.out.println("Weit daneben");
            }

            System.out.println("Nochmal? (true/false)");
            again = sc.nextBoolean();
        }

        sc.close();

    }
}



