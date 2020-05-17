import java.util.Scanner;
public class teilbarkeit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        try {
            System.out.println("Geben Sie eine Ganzzahl als Zaehler ein:");
            x = sc.nextInt();
            System.out.println("Geben Sie eine Ganzzahl als Nenner ein:");
            y = sc.nextInt();
        }catch (Exception e){
            System.out.println("Die eingegebene Zahle ist keine Ganzzahl!");
            return;
        }
        if (x%y == 0){
            System.out.println("Restlos teilbar!");
        }else{
            System.out.println("Nicht restlos teilbar!");
        }
    }
}