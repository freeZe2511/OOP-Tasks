import java.util.*;
public class Zahlensystemrechner {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        boolean wdh = true;
        boolean fehler = false;
        int zahlenbasisin = 0;
        String eingabe = "0";
        String ausgabeBin = "0";
        String ausgabeOkt = "0";
        String ausgabeDez = "0";
        String ausgabeHex = "0";
        String antwort = "0";
        // Programmname
        System.out.println("------------");
        System.out.println("Zahlensystemumrechner");
        System.out.println("Es können beliebige positive Ganzzahlen aus verschiedenen Zahlensystemen in Binär-,Oktal-,Dezimal- und Hexadezimalzahlen umgerechnet werden.");
        // Start Wiederholungsschleife
        while (wdh) {
            // Erläuterung für Anwender
            System.out.println("------------");
            System.out.println("Folgende Angaben werden benötigt:");
            System.out.println("1. Zahlenbasis der Eingabe (2,8,10,16,...)");
            System.out.println("2. Positive ganzzahlige Eingabe");
            System.out.println("------------");
            // 1.Abfrage Zahlenbasis Eingabe mit Exception Catch bei falschem Eingabeformat
            System.out.print("1. Zahlenbasis (Eingabe): ");
            try {
                zahlenbasisin = sc.nextInt();
            } catch (InputMismatchException e) {
                fehler = true;
                break;
            }
            // Abfangen der Eingabe einer Zahlenbasis unter 2
            if (zahlenbasisin < 2) {
                fehler = true;
                break;
            }
            // 2.Abfrage umzurechnende Zahl
            System.out.print("2. Eingabezahl: ");
            try {
                eingabe = sc.next();
            } catch (InputMismatchException e) {
                fehler = true;
                break;
            }
            // Vorbereitung der Rechnung: Umrechnung der Eingabezahl von String in Long, mit Prüfung zur Vermeidung von negativen Zahlen
            long eingabelong = Long.parseLong(eingabe, zahlenbasisin);
            if (eingabelong < 0) {
                fehler = true;
                break;}
            // Umrechnung der Eingabe Ausgabe der Ergebnisse
            System.out.println("Umrechnung der Zahl " + eingabe + " (Zahlenbasis: " + zahlenbasisin + ") abgeschlossen.");
            System.out.println("------------");
            ausgabeBin = Long.toBinaryString(eingabelong);
            System.out.println("Binärzahl: 0b " + ausgabeBin); // Ausgabe als Binärzahl
            ausgabeOkt = Long.toOctalString(eingabelong);
            System.out.println("Oktalzahl: 0 " + ausgabeOkt); // Ausgabe als Oktalzahl
            ausgabeDez = Long.toString(eingabelong);
            System.out.println("Dezimalzahl: " + ausgabeDez); // Ausgabe als Dezimalzahl
            ausgabeHex = Long.toHexString(eingabelong);
            System.out.println("Hexadezimalzahl: 0x " + ausgabeHex); // Ausgabe als Hexadezimalzahl
            System.out.println("------------");
            // Frage nach Wiederholung mit Exception Catch bei falschem Eingabeformat
            System.out.println("Soll eine weitere Umrechnung durchgeführt werden? j/n: ");
            try {
                antwort = sc.next();
            } catch (InputMismatchException e) {
                fehler = true;
                break;
            }
            if (antwort.equals("n") || antwort.equals("N") || antwort.equals("nein") || antwort.equals("Nein")) {
                wdh = false;
            } else if (antwort.equals("j") || antwort.equals("J") || antwort.equals("ja") || antwort.equals("Ja")) {
            } else {
                fehler = true;
                break;
            }
        } // Ende Wiederholungsschleife
        // Information bei Abbruch der Schleife wegen Fehler bei einer Eingabe
        if (fehler) {
            System.out.println("------------");
            System.out.println("FEHLER: Die Eingabe entspricht nicht den beschriebenen Parametern.");
            System.out.println("FEHLER: Das Programm wird beendet.");
            System.out.println("------------");
        }
        // Verabschiedung vor Ende des Programms
        System.out.println(" ");
        System.out.println("Tschüss!");
    }
}