import java.util.Scanner;

public class Task3_3_GradeEvaluation {

    public static void main(String[] args) {

        init();

    }

    public static void averageResult(int res1, int res2, int res3, int res4, int res5){

        double average;
        average = (res1 + res2 + res3 + res4 + res5) / 5;
        System.out.println("Durchschnitt: " + average);


    }

    public static void bestResult(int res1, int res2, int res3, int res4, int res5){

        int best = Math.max(res1, res2);
        if(best<res3){best = res3;}
        if(best<res4){ best =res4;}
        if(best<res5){best = res5;}
        System.out.println("Beste Note: " + best);

    }

    public static void numberOfFailed(int res1, int res2, int res3, int res4, int res5) {

        int fails;
        fails = 0;
        if (res1 < 50)
            fails ++;
        if (res2 < 50)
            fails ++;
        if(res3 < 50)
            fails ++;
        if (res4 < 50)
            fails ++;
        if (res5 < 50)
            fails ++;
        System.out.println("Nicht bestanden: " + fails);

    }

    public static void init(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Eingabe Klausurresultate (in %)");
        int res1 = sc.nextInt();
        int res2 = sc.nextInt();
        int res3 = sc.nextInt();
        int res4 = sc.nextInt();
        int res5 = sc.nextInt();

        if (res1 > 100 || res2 > 100 || res3 > 100 || res4 > 100 || res5 > 100){
            System.out.println("Ungültige Eingabe! (Ergebnis > 100%)");
        }else{

            System.out.println("Erreichte Noten: " + res1 + ", " + res2 + ", " + res3 + ", " + res4 + ", " + res5);
            averageResult(res1, res2, res3, res4, res5);
            bestResult(res1, res2, res3, res4, res5);
            numberOfFailed(res1, res2, res3, res4, res5);
        }

    }
}
