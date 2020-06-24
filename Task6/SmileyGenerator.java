package Task6;

public class SmileyGenerator {

    public static void main(String[] args) {

        Smiley happy = new Smiley("black", "yellow", "happy");
        Smiley angry = new Smiley("black", "red", "angry");
        Smiley excited = new Smiley("black", "yellow", "excited");

        happy.generateSmiley();
        angry.generateSmiley();
        excited.generateSmiley();

    }

}
