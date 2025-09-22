import java.util.Scanner;

public class VendingMachineApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();

        vm.displayMenu();
        System.out.println("Please enter selection: ");
        int choice = sc.nextInt();
        sc.nextLine();
        Drink selectedDrink = vm.selectDrink(choice);
        if (selectedDrink == null){
            System.out.println("Invalid selection");
            sc.close();
            return;
        }
        double amount = vm.insertCoins(selectedDrink.getPrice());
        vm.checkChange(amount, selectedDrink.getPrice());
        vm.printReceipt(selectedDrink);
        sc.close();
    }
}