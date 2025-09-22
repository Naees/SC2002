import java.util.*;

public class VendingMachine {
    private Map<Integer, Drink> drinks;

    // constructor
    public VendingMachine() {
        drinks = new HashMap<>();
        drinks.put(1, new Drink("Beer", 3.00));
        drinks.put(2, new Drink("Coke", 1.50));
        drinks.put(3, new Drink("Green Tea", 5.00));
    }

    // get the drink selection, and return the cost of the drink
    public Drink selectDrink(int choice) {
        return drinks.get(choice);
    }

    // insert the coins and returns the amount inserted
    public double insertCoins (double drinkCost) {
        double total = 0;
        System.out.println("Please insert coins: ");
        System.out.println("========== Coins Input ===========");
        System.out.println("|Enter 'Q' for ten cents input |");
        System.out.println("|Enter 'T' for twenty cents input|");
        System.out.println("|Enter 'F' for fifty cents input |");
        System.out.println("|Enter 'N' for one dollar input   |");
        System.out.println("==================================");
        Scanner sc = new Scanner(System.in);
        while (total < drinkCost) {
            String coin = sc.nextLine().toUpperCase();
            switch(coin) {
                case "Q":
                    total += 0.10;
                    break;
                case "T":
                    total += 0.20;
                    break;
                case "F":
                    total += 0.50;
                    break;
                case "N":
                    total += 1.00;
                    break;
                default:
                    System.out.println("Invalid coin. Please try again");
                    continue;
            }
            System.out.printf("Coins inserted: %.2f\n", total);
        }
        sc.close();
        return total;
    }

    // check the change and print the change on screen
    public void checkChange(double amount, double drinkCost) {
        double change = amount - drinkCost;
        if (change > 0) {
            System.out.printf("Change: $%.2f\n", change);
        }
    }

    public void displayMenu() {
        System.out.println("========== Vending Machine Menu ===========");
        for(Map.Entry<Integer, Drink> entry: drinks.entrySet()){
            System.out.printf("| %d. Buy %s ($%.2f) |\n", entry.getKey(), entry.getValue().getName(), entry.getValue().getPrice());
        }
        System.out.println("===========================================");
    }

    // print the receipt and collect the drink
    public void printReceipt(Drink drink) {
        System.out.println("Please collect your " + drink.getName());
        System.out.println("Thank you !!");
    }
}