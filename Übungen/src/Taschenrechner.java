import java.util.Scanner;
import java.lang.Math;

public class Taschenrechner {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String again = "j";
        int x = 0;
        int y = 0;
        int ro = 0;

        while (again.equals("j") || again.equals("y") || again.equals("ja")){

            try {
                System.out.println("Zahl 1: ");
                x = sc.nextInt();
                System.out.println("Zahl 2: ");
                y = sc.nextInt();

            } catch (Exception e) {
                System.out.println("Ungültige Eingabe!");
                break;
            }

            try {
                System.out.println("Rechenoperation: (1-7)");
                System.out.println("1: Addition");
                System.out.println("2: Subtraktion");
                System.out.println("3: Multiplikation");
                System.out.println("4: Division");
                System.out.println("5: x^y");
                System.out.println("6: x!");
                System.out.println("7: y!");
                ro = sc.nextInt();

            } catch (Exception e) {
                System.out.println("Ungültige Eingabe!");
                break;
            }


            switch (ro){
                case 1:
                    int erg1 = calcSum(x, y);
                    System.out.println("Summe: " + erg1);
                    break;
                case 2:
                    int erg2 = calcDiff(x, y);
                    System.out.println("Differenz: " + erg2);
                    break;
                case 3:
                    int erg3 = calcProd(x, y);
                    System.out.println("Produkt: " + erg3);
                    break;
                case 4:
                    double erg4 = calcQuot(x, y);
                    System.out.println("Quotient: " + erg4);
                    break;
                case 5:
                    double erg5 = calcXPowY(x, y);
                    System.out.println("x^y: " + erg5);
                    break;
                case 6:
                    int erg6 = calcXFac(x);
                    System.out.println("x!: " + erg6);
                    break;
                case 7:
                    int erg7 = calcYFac(y);
                    System.out.println("y!: " + erg7);
                    break;
                default: System.out.println("Ungültige Eingabe!");

            }

            System.out.println("Nochmal? (j/n)");
            again = sc.next();

        }

    }

    private static int calcSum (int x, int y){
        int sum;
        sum = x + y;
        return sum;
    }

    private static int calcDiff (int x, int y){
        int diff;
        diff = x - y;
        return diff;
    }

    private static int calcProd (int x, int y) {
        int prod;
        prod = x * y;
        return prod;
    }

    private static double calcQuot (int x, int y) {
        double quot;
        quot = (double) x / y;
        return quot;
    }

    private static double calcXPowY (int x, int y) {
        double xpowy;
        xpowy = Math.pow(x, y);
        return xpowy;
    }

    private static int calcXFac (int x) {

        if (x==0){
            return 1;
        }
        for (int i = x -1; i > 0; i--)
            x = x * i;

        return x;
    }

    private static int calcYFac (int y) {

        if (y==0){
            return 1;
        }
        for (int i = y - 1; i > 0; i--)
            y = y * i;

        return y;
    }

}