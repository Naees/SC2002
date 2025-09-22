import java.util.Scanner;
import java.util.Random;
public class Lab2p1 {
    static Scanner sc = new Scanner(System.in);
    
public static void main(String[] args)
{
    int choice;
    do {
        System.out.println("Perform the following methods:");
        System.out.println("1: miltiplication test");
        System.out.println("2: quotient using division by subtraction");
        System.out.println("3: remainder using division by subtraction");
        System.out.println("4: count the number of digits");
        System.out.println("5: position of a digit");
        System.out.println("6: extract all odd digits");
        System.out.println("7: quit");

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                mulTest();
                break;
            case 2: /* add divide() call */
                System.out.println("Enter two integers for division:  ");
                int m1 = sc.nextInt();
                int n1 = sc.nextInt();
                System.out.println("Quotient is: " + divide(m1,n1));
                break;
            case 3: /* add modulus() call */
                System.out.println("Enter two integers for modulo opertion: ");
                m1 = sc.nextInt();
                n1 = sc.nextInt();
                System.out.println("Remainder is: " + modulus(m1, n1));
                break;
            case 4: /* add countDigits() call */
                System.out.println("Enter an integer: ");
                m1 = sc.nextInt();
                System.out.println("Position = " + countDigits(m1));
                break;
            case 5: /* add position() call */
                System.out.println("Enter a positive integer: ");
                int n3 = sc.nextInt();
                System.out.println("Enter the digit to search: ");
                int d = sc.nextInt();
                System.out.println("Position is: " + position(n3, d));
                break;
            case 6: /* add extractOddDigits() call */
                System.out.println("Enter a positive integer: ");
                int n4 = sc.nextInt();
                if (n4 <= 0) {
                    System.out.println("Error input!");
                    break;
                }
                System.out.println("Odd digits are " + extractOddDigits(n4));
                break;
            case 7: 
                System.out.println("Program terminating ….");
                break;
                }
        } while (choice < 7);
        sc.close();
    }
    /*add method code here */
    public static void mulTest() {
        Random rand = new Random();
        int correct = 0;

        for (int i = 0; i < 5; i++) {
            int a = rand.nextInt(9) + 1;
            int b = rand.nextInt(9) + 1;
            System.out.printf("How much is %d times %d? ", a , b);
            int ans = sc.nextInt();
            if (ans == a * b) {
                correct++;
                System.out.println("Very good!");
            }
        }
        System.out.println("..............");
        System.out.printf("%d answers out of 5 are correct.%n", correct);
    }

    public static int divide(int m, int n) {
        if (n == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        int quotient = 0;
        while (m >= n) {
            m -= n;
            quotient++;
        }
        return quotient;
    }

    public static int modulus(int m, int n) {
        if (n == 0) {
            throw new ArithmeticException("Modulo by zero!");
        } else {
            while (m >= n) {
            m -= n;
            }
        }
        return m;
    } 

    public static int countDigits(int n) {
        int count = 0;
        if (n <= 0) {
            System.out.println("The number is negative!");
        } else {
            while (n > 0) {
            n /= 10;
            count++;
            }
        }
        return count;
    }

    public static int position(int n, int digits) {
        if (n <= 0) {
            System.out.println("The number given is negative!");
            return -1;
        } else {
            int position = 1;
            while (n > 0) {
                int d = n % 10;
                if (d == digits) {
                    return position;
                } 
                n /= 10;
                position++;
            }
            return -1;
        }

    }

    public static long extractOddDigits(long n) {
        if (n <= 0) System.out.println("The number is negative!");
        long result = 0;
        long multiplier = 1;
        while (n > 0) {
            int digit = (int) (n % 10);
            if (digit % 2 != 0) {
                result = digit * multiplier + result;
                multiplier *= 10;
            }
            n /= 10;
        }
        return result;
    }
}
