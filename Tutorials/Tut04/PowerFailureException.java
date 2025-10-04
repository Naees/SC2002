public class PowerFailureException extends Exception{
    public PowerFailureException() {
        super("Powe Failure");
    }

    public PowerFailureException(String e) {
        super(e);
    }
}