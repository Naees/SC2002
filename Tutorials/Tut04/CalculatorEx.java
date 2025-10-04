import java.util.Scanner;
public class CalculatorEx {
    private double result;
    private double precision = 0.0001;
    public static void main(String[] args) {
        CalculatorEx calculator = new CalculatorEx();
        try {
            System.out.println("Calculator is on");
            calculator.doCalculations();
        }
        catch (UnknownOperatorException e) {
            calculator.handleUnknownOpException(e);
        } 
        catch (Exception e) {
            System.out.println("Other Exception " + e.getMessage());
        }
        System.out.println("Final result = " + calculator.resultValue());
        System.out.println("End of Program");
    }

    public CalculatorEx() {
        result = 0.0;
    }

    public double resultValue() {
        return result;
    }

    public void doCalculations() throws ArithmeticException, UnknownOperatorException {
        char nextOp;
        double nextNumber;
        boolean done = false;
        Scanner sc = new Scanner(System.in);
        try {
            while (!done) {
                System.out.println("Enter + - * / or Q/q to quit");
                String nextOpStr = sc.next();
                nextOp = nextOpStr.charAt(0);
                if ((nextOp ==  'Q') || (nextOp == 'q'))
                    done = true;
                else {
                    System.out.println("Enter the number > ");
                    nextNumber = sc.nextDouble();
                    result = evaluate(nextOp, result, nextNumber);
                    System.out.println("result " + nextOp + " " + nextNumber + " = " + result);
                    System.out.printf("updated result = %.1f\n", result);
                }
            }
        } finally {
            sc.close();
        }
    }

    public double evaluate (char op, double n1, double n2) 
    throws ArithmeticException, UnknownOperatorException {
        double answer;
        switch (op) {
            case '+':
                answer = n1 + n2;
                break;
            case '-':
                answer = n1 - n2;
                break;
            case '*':
                answer = n1 * n2;
                break;
            case '/':
                if (Math.abs(n2) < precision)
                    throw new ArithmeticException("Division by zero");
                answer = n1 / n2;
                break;
            default:
                throw new UnknownOperatorException(op);
        }
        return answer;
    }

    public void handleUnknownOpException (UnknownOperatorException e) {
        System.out.println(e.getMessage());
        System.out.println("Please reenter:");
        try {
            doCalculations();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Try again later");
            System.out.println("End of Program");
            System.exit(0);
        }  
    }
}