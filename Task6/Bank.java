package Task6;

public class Bank {
    public static void main(String[] args) {

        Konto k1 = new Konto(1234, 100);

        System.out.println(k1);
        System.out.println(k1.getBetrag());
        k1.zahleEin(100);
        System.out.println(k1);
        k1.hebeAb(50);
        System.out.println(k1);
    }
}
