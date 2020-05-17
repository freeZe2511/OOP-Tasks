import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task2_4_RandomNumbers_CSV {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Anzahl Würfeln: ");
        int wdh = sc.nextInt();
        int wuerfel = 0;
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

        List counters = Arrays.asList(counter1, counter2, counter3, counter4, counter5, counter6);
        Iterator countersIt = counters.listIterator();;

        try (PrintWriter writer = new PrintWriter(new File("Task2_4CSV.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("Zahl");
            sb.append(",");
            sb.append("Anzahl");
            sb.append("\n");

            for(int k=0; k<6; k++){
                sb.append(k+1);
                sb.append(",");
                sb.append(countersIt.next());
                sb.append("\n");

            }

            writer.write(sb.toString());

            System.out.println(".csv erstellt");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
