import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vorname: ");
        String vn = sc.next();
        System.out.println("Nachname: ");
        String nn = sc.next();
        String hello = "Hallo ";

        System.out.println(hello + vn + " " + nn + "!");

    }
}
