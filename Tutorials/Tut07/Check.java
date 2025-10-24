public class Check {
    private double amount;
    private String checkID;

    public Check(double amount, String checkID){
        this.amount = amount;
        this.checkID = checkID;
    }

    public double getAmount() {
        return amount;
    }

    public String getCheckNo() {
        return checkID;
    }

    @Override
    public String toString() {
        return "Check [amount=" + amount + ", checkID=" + checkID + "]";
    }
}