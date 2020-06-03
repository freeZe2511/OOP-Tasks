import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task5_1_Calculator_CommandLine {

    public static void main(String[] args) {

        BufferedWriter bw = null;

        try {

            String operand1;
            String operand2;
            String operator;

            // show all parameters
            for (String value: args) {
                System.out.println(value);
            }

            // extract "operand1"
            String operand1TextLine = args[0];
            String[] operand1Elements = operand1TextLine.split(":");
            operand1 = operand1Elements[1];

            // extract "operand2"
            String operand2TextLine = args[2];
            String[] operand2Elements = operand2TextLine.split(":");
            operand2 = operand2Elements[1];

            //extract "operator"
            String operatorTextLine = args[1];
            String[] operatorElements = operatorTextLine.split(":");
            operator = operatorElements[1];

            //calculation
            double op1 = Double.parseDouble(operand1);
            double op2 = Double.parseDouble(operand2);
            double erg = 0;

            switch (operator) {
                case "+":
                    erg = op1 + op2;
                    break;
                case "-":
                    erg = op1 - op2;
                    break;
                case "*":
                    erg = op1 * op2;
                    break;
                case "/":
                    erg = op1 / op2;
                    break;
                case "%":
                    erg = op1 % op2;
                    break;
                default:
                    System.out.println("Fehler!");
                    break;
            }

            String erg1 = String.valueOf(erg);
            String log = operand1 + operator + operand2 + "=" + erg1;
            System.out.println(log);


            File file = new File("C:\\...\\log.txt");

            if (!file.exists()) {
                file.createNewFile();

            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(log);
            System.out.println("File written Successfully");

        }catch (IOException ioe) {
            ioe.printStackTrace();

        }finally
        {
            try{
                if(bw!=null)
                    bw.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }

    }

}

