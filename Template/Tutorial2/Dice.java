package Template.Tutorial2;
import java.util.Random;
public class Dice {
    private int valueOfDice;
    private Random random;

    public Dice() {
        this.random = new Random();
        this.valueOfDice = 0;
    }

    public void setDiceValue() {
        this.valueOfDice = random.nextInt(6) + 1;
    }

    public int getDiceValue() {
        return this.valueOfDice;
    }

    public void printDiceValue() {
        System.out.println("Current Value is " + this.valueOfDice);
    }
}