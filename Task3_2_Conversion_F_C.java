import java.util.Scanner;

public class Task3_2_Conversion_F_C {

    public static void main(String[] args) {

        init();

    }

    public static double cToF (double eingabe){

        double tempF;
        tempF = (eingabe * 1.8) + 32;
        return tempF;

    }

    public static double fToC (double eingabe){

        double tempC;
        tempC = (eingabe - 32) / 1.8;
        return tempC;

    }

    public static void init(){

        Scanner sc = new Scanner(System.in);
        boolean repeat = true;

        while (repeat){

            System.out.println("Eingabe Einheit Temperatur °F/°C? (F/C)");
            String tempA = sc.next();
            System.out.println("Eingabe Temperatur:");
            double eingabe = sc.nextDouble();

            ausgabe(tempA, eingabe);
            repeat = repeatCalc(repeat);
        }

    }

    public static void ausgabe (String tempA, double eingabe){

        if (tempA.equals("F") || tempA.equals("f")){

            double temp = fToC(eingabe);
            System.out.println(eingabe + "°F" + "  ->  " + temp + "°C");

        }else if (tempA.equals("C") || tempA.equals("c")){

            double temp = cToF(eingabe);
            System.out.println(eingabe + "°C" + "  ->  " + temp + "°F");

        }else{
            System.out.println("Ungültige Eingabe");

        }
    }

    public static boolean repeatCalc (boolean repeat){

        Scanner sc = new Scanner(System.in);
        System.out.println("Neue Rechnung? (j/n)");
        String repeat1 = sc.next();

        if (repeat1.equals("j") || repeat1.equals("y") || repeat1.equals("ja")){
            return true;
        }else{
            return false;
        }
    }
}
