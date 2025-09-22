package Template.Tutorial3;
import java.util.*;
public class VendingMachine {
    private Scanner sc;
    // Constructor
    public VendingMachine() {
        sc = new Scanner(System.in);
    }

    public double selectDrink() {
        int drinkSelection = 0;
        double drinkCost = 0.0;
        System.out.println("===== Vending Machine =====" );
        System.out.println("| 1. Buy Beer ($3.00)      |");
        System.out.println("| 2. Buy Coke ($1.00)      |");
        System.out.println("| 3. Buy Green Tea ($5.00) |");
        System.out.println("===========================");
        do {
            System.out.println("Please enter selection: ");
            drinkSelection = sc.nextInt();
            switch (drinkSelection){
                case 1:
                    drinkCost = 3.00;
                    break;
                case 2:
                    drinkCost = 1.00;
                    break;
                case 3:
                    drinkCost = 5.00;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
            return drinkCost;
        }   while (drinkCost != 1 || drinkCost != 2 || drinkCost != 3);
    }

    public double insertCoins(double drinkCost) {
        double amount = 0.0;
        System.out.println("========== Coins Input ===========");
        System.out.println("| Enter 'Q' for ten cents input     |");
        System.out.println("| Enter 'T' for twenty cents input  |");
        System.out.println("| Enter 'F' for fifty cents input   |");
        System.out.println("| Enter 'N' for a dollar cents input|");
        System.out.println("====================================");
        do {
            char coin = sc.next().charAt(0);
            switch (coin) {
                case 'Q': case 'q':
                    amount += 0.10;
                    break;
                case 'T': case 't':
                    amount += 0.20;
                    break;
                case 'F': case 'f':
                    amount += 0.50;
                    break;
                case 'N': case 'n':
                    amount += 1.00;
                    break;
                default:
                    System.out.println("Invalid coin input. Please try again.");
            }
            System.out.println("Coin inserted: " + amount);
        } while (amount < drinkCost);
        return amount;
    }
    public void checkChange(double amount, double drinkCost) {
        double change = 0.0;
        if (amount > drinkCost) {
            change = amount - drinkCost;
            System.out.printf("Change: %.2f \n",change);
        }
    }
    public void printReceipt() {
        System.out.println("Please collect your drink");
        System.out.println("Thank You !!");
        sc.close();
    }
}