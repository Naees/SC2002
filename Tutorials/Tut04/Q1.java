public class Q1 {
    public static void main (String[] args) {
        int waitTime = 46; // change to 12 for the questions
        try {
            System.out.println("Try block entered");
            if (waitTime > 30) {
                throw new Exception("Time Limited Exceeded");
            }
            System.out.println("Leaving try block");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("After catch block");
    }
}