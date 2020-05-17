import java.util.Scanner;

public class Task3_4_Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ganzzahl fakultieren: ");
        int x = sc.nextInt();

        if (x < 0){
            System.out.println("Ungültige Eingabe");
        }else{
            int fac = calcFactorial(x);
            System.out.println(x + "!  =  " + fac);
        }

    }

    public static int calcFactorial (int x){

        if (x==0){
            return 1;
        }
        for (int i = x-1; i > 0; i--)
            x = x * i;

        return x;

    }
}
