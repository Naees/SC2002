public class Bank {
    private CheckingAccount account;

    public Bank(CheckingAccount account) {
        this.account = account;
    }

    public double cashCheck(Check theCheck) {
        double amount = theCheck.getAmount();
        double balance = account.getBalance();

        // Check for insufficient funds
        if (balance < amount) {
            account.addInsuffientFundFee();
            account.noteReturnedCheck(theCheck);
            returnCheck(theCheck); // failed transaction
            return -1;
        }

        // Otherwise, process the check
        String checkNumber = theCheck.getCheckNo();
        account.addDebitTransaction(checkNumber, amount);
        account.storePhotoOfCheck(theCheck);
        return amount;
    }

    public void returnCheck(Check theCheck) {
        System.out.println("Check returned to customer: " + theCheck);
    }
}