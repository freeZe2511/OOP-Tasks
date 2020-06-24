package Task6;

public class Konto {

    private int kontonummer;
    private double betrag;

    public Konto(int kontonummer, double betrag){
        this.kontonummer = kontonummer;
        this.betrag = betrag;
    }

    public double getBetrag() {
        return betrag;
    }

    public void zahleEin(double betrag){
        this.betrag = this.betrag + betrag;
    }

    public void hebeAb(double betrag){
        this.betrag = this.betrag - betrag;
    }

    @Override
    public String toString() {
        return "Konto{" + "kontonummer=" + kontonummer + ", betrag=" + betrag + '}';
    }
}
