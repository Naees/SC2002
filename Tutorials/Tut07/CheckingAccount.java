import java.util.ArrayList;
import java.util.List;

public class CheckingAccount {
    private String accountNumber;
    private double balance;
    private List<String> transactions;

    public CheckingAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void addInsuffientFundFee() {
        transactions.add("Insufficient fund fee");
    }

    public void noteReturnedCheck(Check theCheck) {
        transactions.add("Returned check: " + theCheck.toString());
    }

    public void addDebitTransaction(String checkNumber, double amount) {
        this.balance -= amount;
        transactions.add("Debit transaction - Check No: " + checkNumber + ", Amount: ");
    }

    public void storePhotoOfCheck(Check theCheck) {
        // Placeholder: simulate storing a digital image of the check
        System.out.println("Photo of check " + theCheck.getCheckNo() + " stored.");
    }

    @Override
    public String toString() {
        return "CheckingAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", transactions=" + transactions + "]";
    }
}