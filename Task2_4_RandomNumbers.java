import java.util.Random;
import java.util.Scanner;

public class Task2_4_RandomNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Anzahl Würfeln: ");
        int wdh = sc.nextInt();
        int wuerfel = rand.nextInt(6)+1;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;

        for(int i=0; i<wdh; i++){
            wuerfel = rand.nextInt(6)+1;

            if(wuerfel==1){
                counter1++;

            }else if(wuerfel==2){
                counter2++;

            }else if(wuerfel==3){
                counter3++;

            }else if(wuerfel==4){
                counter4++;

            }else if(wuerfel==5){
                counter5++;

            }else{
                counter6++;

            }
        }

        System.out.println("Anzahl 1: " + counter1);
        System.out.println("Anzahl 2: " + counter2);
        System.out.println("Anzahl 3: " + counter3);
        System.out.println("Anzahl 4: " + counter4);
        System.out.println("Anzahl 5: " + counter5);
        System.out.println("Anzahl 6: " + counter6);


    }
}
