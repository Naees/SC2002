import java.util.Scanner;

public class P3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final double CONVERSION_RATE = 1.82;
        System.out.print("Enter starting value: ");
        int starting = scanner.nextInt();
        System.out.print("Enter ending value: ");
        int ending = scanner.nextInt();
        System.out.print("Enter increment: ");
        int increment = scanner.nextInt();
        if (starting > ending){
            System.out.println("Error input!!");
            scanner.close();
            return;
        }
        System.out.println("\nTable 1 (For loop)");
        System.out.printf("%-10s %10s%n", "US$", "S$");
        System.out.println("-----------------------");
        for (int usd = starting; usd <= ending; usd += increment) {
            double sgd = usd * CONVERSION_RATE;
            System.out.printf("%-10d %10.1f%n", usd, sgd);
        }

        System.out.println("\nTable 2(While loop)");
        System.out.printf("%-10s %10s%n", "US$", "S$");
        System.out.println("-----------------------");
        int usd = starting;
        while (usd <= ending){
            double sgd = usd * CONVERSION_RATE;
            System.out.printf("%-10d %10.1f%n", usd, sgd);
            usd += increment;
        }

        System.out.println("\nTable 3 (Do-while loop)");
        System.out.printf("%-10s %10s%n", "US$", "S$");
        System.out.println("-----------------------");
        usd = starting;
        do {
            double sgd = usd * CONVERSION_RATE;
            System.out.printf("%-10d %10.1f%n", usd, sgd);
            usd += increment;
        } while (usd <= ending);

        scanner.close();
    }
}