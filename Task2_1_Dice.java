import java.util.Random;

public class Task2_1_Dice {

    public static void main(String[] args) {

        Random rand = new Random();
        int wuerfel = rand.nextInt(6)+1;
        int counter = 0;

        while(wuerfel < 6){
            wuerfel = rand.nextInt(6)+1;
            counter +=1;
            System.out.println("Wurf: " + counter + " Augenzahl: " + wuerfel);
        }
    }

}
