import java.util.Random;

public class Dice {
    private int valueOfDice;
    private Random rand;
    // Constructor
    public Dice() {
        rand = new Random();
        this.valueOfDice = 1; // default starting value
    }

    public void setDiceValue(){
        this.valueOfDice = rand.nextInt(6) + 1;
    }

    public int getDiceValue() {
        return this.valueOfDice;
    }

    public void printDiveValue() {
        System.out.println("Current Value is " + this.valueOfDice);
    }
}