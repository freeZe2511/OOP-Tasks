public class Task1_3_SmileyHTML {
    public static void main(String[] args) {
        // Variable
        String seitenkopf = "<!DOCTYPE html> \n <html> \n <body> \n <svg height='1000' width='1000'>";
        String seitenfuss = "\n </svg>\n </body> \n </html>";
        String kreis = "<circle cx='150' cy='150' r='100' stroke='black' stroke-width='6' fill='red'/>";
        String rechteck = "<rect x='350' y='250' width='100' height='200' stroke='blue' stroke-width='3' fill='green'/>";
        String kreisbogen = "<path d='M 10 380 q 50,50 100,0' />";

// Ausgabe
        System.out.println(seitenkopf);
        System.out.println(kreis);
        System.out.println(rechteck);
        System.out.println(kreisbogen);
        System.out.println(seitenfuss);

    }

}
