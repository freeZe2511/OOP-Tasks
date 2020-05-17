import java.util.Scanner;

public class Fahrtdauer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Durchschnittsgeschwindigkeit? (km/h)");
        double dGeschw = sc.nextDouble();
        System.out.println("Strecke? (km)");
        double strecke = sc.nextDouble();
        System.out.println("Durchschnittsverbrauch? (L/100km)");
        double dVerbrauch = sc.nextDouble();

        double time = calcTime(dGeschw, strecke);
        double verbrauch = calcVerbrauch(dVerbrauch, strecke);

        System.out.println("Fahrtdauer: " + time + " Stunde(n)");
        System.out.println("Verbrauch: " + verbrauch + " Liter");

    }

    private static double calcTime (double dGeschw, double strecke){

        double timeM;
        timeM = strecke / dGeschw;
        return timeM;
    }

    private static double calcVerbrauch (double dVerbrauch, double strecke){

        double verbrauchM;
        verbrauchM = dVerbrauch/100 * strecke;
        return verbrauchM;
    }
}
