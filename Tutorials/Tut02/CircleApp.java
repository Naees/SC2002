import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = null;   // will hold our circle object
        int choice;
        System.out.println("==== Circle Computation ====");
        System.out.println("|1. Create a new circle   |");
        System.out.println("|2. Print Area  |");
        System.out.println("|3. Print circumference |");
        System.out.println("|4. Quit    |");
        System.out.println("===========================");
        do {
            System.out.println("Choose option (1-3): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the radius to compute the area and circumference");
                    double rad = scanner.nextDouble();
                    circle = new Circle(rad);
                    System.out.println("A new circle is created\n");
                    break;
                case 2:
                    if (circle == null) {
                        System.out.println("Error: No circle created yet. Please create a circle first.\n");
                        break;
                    }
                    else {
                        System.out.println("Area of circle");
                        System.out.printf("Radius: %.2f\n", circle.getRadius());
                        circle.printArea();
                        System.out.println();
                        break;
                    }
                case 3:
                    if (circle == null) {
                        System.out.println("Error: No circle created yet. Please create a circle first.\n");
                    } else {
                        System.out.println("Circumference of circle");
                        System.out.println("Radius: " + circle.getRadius());
                        circle.printCircumference();
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Thank you!!");
            }
        } while (choice != 4);
        scanner.close();
    }
}