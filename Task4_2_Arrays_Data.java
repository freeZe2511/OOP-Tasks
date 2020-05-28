public class Task4_2_Arrays_Data {

    //static int[] hours = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
    static double[] temps = {11, 10, 9, 8, 7, 7, 7, 9, 11, 12, 13, 14, 16, 17, 17, 18, 19, 18, 18, 17, 16, 15, 14, 13};

    public static void main(String[] args) {

        System.out.println(findMax(temps));
        System.out.println(findMin(temps));



    }

    public static String findMax(double[] temps){

        double max = temps[0];
        for (int i=0; i<temps.length; i++){
            if(temps[i]>max){
                max = temps[i];

            }
        }

        int maxIndex = 0;
        for (int i=1; i < temps.length; i++){
            if (temps[i] > temps[maxIndex]){
                maxIndex = i;
            }
        }
        maxIndex = maxIndex + 1;

        return "Max Temperature is " + max + "°C at " + maxIndex + " o´clock!";

    }

    public static String findMin(double[] temps){

        double min = temps[0];
        for (double temp : temps) {
            if (temp < min) {
                min = temp;
            }
        }

        int minI = 0;

        for (int i = 0; i < temps.length; i++) {
            minI = temps[i] < temps[minI] ? i : minI;
        }
        minI+=1;

        return "Min Temperature is " + min + "°C at " + minI + " o´clock!";

    }
}
