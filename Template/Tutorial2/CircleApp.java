package Template.Tutorial2;
import java.util.Scanner;
public class CircleApp{ 
    public static void main(String[] args) {
        Circle circle = null;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Circle Computation ====");
        System.out.println("| 1. Create a new circle | ");
        System.out.println("| 2. Print Area |");
        System.out.println("| 3. Print circumference |");
        System.out.println("| 4. Quit |");
        System.out.println("===========================");

        do {
            System.out.println("Choose option (1-3): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the radius to compute the area and circumference");
                    double rad = sc.nextDouble();
                    circle = new Circle(rad);
                    System.out.println("A new circle is created\n");
                    break;
                case 2:
                    if (circle == null) {
                        System.out.println("No circle created yet!");
                    } else {
                        circle.printArea();
                    }
                    break;
                case 3:
                    if (circle == null) {
                        System.out.println("No circle created yet!");
                    } else {
                        circle.printCircumference();
                    }
                    break;
                case 4:
                    System.out.println("Thank you!!");
            }
        } while (choice != 4);
        sc.close();
    }
}