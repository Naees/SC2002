package Template.Tutorial3;
public class VendingMachineApp {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        double drinkCost = vm.selectDrink();
        double drinkAmt = vm.insertCoins(drinkCost);
        vm.checkChange(drinkAmt, drinkCost);
        vm.printReceipt();
    }
}