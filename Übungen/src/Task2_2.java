import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte Radius eingeben:");
        double r = sc.nextDouble();

        System.out.println("Bitte Höhe eingeben:");
        double h = sc.nextDouble();

        double pi = Math.PI;
        double umfang = 2*r*pi;
        double durchmesserBoden = 2*r;
        double flacheBoden = pi*r*r;
        double mantel = 2*pi*r*h;
        double flacheGes = 2*pi*r*r+2*r*pi*h;
        double volume = pi*r*r*h;

        System.out.println("Umfang: " + umfang + "\n" + "Durchmesser Boden: " + durchmesserBoden + "\n" +
                            "Fläche Boden: " + flacheBoden + "\n" + "Mantelfläche: " + mantel + "\n" +
                            "Oberfläche Gesamt: " + flacheGes + "\n" + "Volumen: " + volume);
    }
}
