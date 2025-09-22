import java.util.Scanner;

public class DiceApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice();
        Dice dice2 = new Dice();

        System.out.println("Press <key> to roll the first dice");
        sc.nextLine();
        dice.setDiceValue();
        dice.printDiveValue();

        System.out.println("Press <key> to roll the second dice");
        sc.nextLine();
        dice2.setDiceValue();
        dice2.printDiveValue();
        
        System.out.println("Your total number is: " + (dice.getDiceValue() + dice2.getDiceValue()));
    }
}