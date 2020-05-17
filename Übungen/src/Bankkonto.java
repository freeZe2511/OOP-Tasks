public class Bankkonto {

    public String name;
    public String vorname;
    public int kontonummer;
    public double kontostand;
    public int kontolimit;

    public static void main(String[] args) {

        Bankkonto konto1 = new Bankkonto();
        konto1.name = "Eggers";
        konto1.vorname = "Tim";
        konto1.kontonummer = 2511;
        konto1.kontostand = 250000;
        konto1.kontolimit = -5000;

        Bankkonto konto2 = new Bankkonto();
        konto2.name = "Hartmann";
        konto2.vorname = "Sebastian";
        konto2.kontonummer = 1706;
        konto2.kontostand = 10000;
        konto2.kontolimit = -100;


        System.out.println(konto1.toString());

        System.out.println(konto2.toString());

    }

    public String toString(){

        return  "Name            : " + name + "\n" +
                "Vorname         : " + vorname + "\n" +
                "Kontonummer     : " + kontonummer + "\n" +
                "Kontostand      : " + kontostand + "\n" +
                "Kontolimit      : " + kontolimit;

    }

    public int cashIn(){

        return 0;

    }

    public int cashOut(){

        return 0;

    }

    public double getKontostand(){

        return 0;

    }
}
