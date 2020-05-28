import java.util.Arrays;
import java.util.Random;

public class Task4_1_Arrays_Lotto {

    static int[] zahlen = new int[100];
    static int[] doppelteZahlen = new int[49];
    static Random n = new Random();

    public static void main(String[] args) {

        initArray(zahlen);
        ausgabeArray(zahlen);

        System.out.println("Maximalwert: " + maxWert(zahlen));
        System.out.println("Minimalwert: " + minWert(zahlen));
        System.out.println("Mittelwert: " + midWert(zahlen));

        sucheDoppelte(zahlen);

        System.out.println("\n" + "Auswertung:");
        ausgabeArray(doppelteZahlen);
        System.out.println("Erste doppelte Zahl: " + indexErsteDoppelte(zahlen) + "\n");
        sortArray(zahlen);      // Veranschaulichuung
        
    }

    public static void initArray(int[] zahlen){

        for (int i=0; i<zahlen.length; i++){

             zahlen[i] = n.nextInt(49)+1;
        }

    }

    public static void ausgabeArray(int[] z){

        System.out.println("\n" + Arrays.toString(z) + "\n");

    }

    private static void sortArray(int[] zahlen){

        Arrays.sort(zahlen);

        System.out.println(Arrays.toString(zahlen) + "\n");

    }

    public static void sucheDoppelte(int[] zahlen){

        for (int x : zahlen) {
            doppelteZahlen[x-1]++;
        }

    }

    public static int maxWert(int[] zahlen){

        int max = zahlen[0];
        for (int i=1; i<zahlen.length; i++){
            if (zahlen[i]>max){
                max = zahlen[i];
            }
        }

        return max;

    }

    public static int minWert(int[] zahlen){

        int min = zahlen[0];
        for (int i=1; i<zahlen.length; i++)
            if (zahlen[i]<min){
                min = zahlen[i];
            }

        return min;

    }

    public static double midWert(int[] zahlen){

        double sum = 0;
        for (int i=0; i<zahlen.length; i++){
            sum+=zahlen[i];
        }
        double mid = sum / zahlen.length;

        return mid;

    }

    public static String indexErsteDoppelte(int[] array){

        int ersteDoppelte = 100;
        int Index2 = 100;
        int counter = 0;
        for (int i = 1; i < 49; i++) {
            if (doppelteZahlen[i] > 1) {
                counter = 0;
                for (int index = 0; index < array.length; index++) {
                    if (zahlen[index] == i) {
                        counter += 1;
                        if (counter == 2 && index < Index2) {
                            ersteDoppelte = zahlen[index];
                            Index2 = index + 1;
                            break;
                        }
                    }
                }
            }
        }
        return ersteDoppelte + " ,Index: " + Index2;
    }
}
