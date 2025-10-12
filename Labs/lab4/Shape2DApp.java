import java.util.*;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape2D> shapes = new ArrayList<>();

        System.out.print("Enter total number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nChoose shape: 1) Circle 2) Rectangle 3) Triangle");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    shapes.add(new Circle(r));
                    break;
                case 2:
                    System.out.print("Enter length and breadth: ");
                    double l = sc.nextDouble();
                    double b = sc.nextDouble();
                    shapes.add(new Rectangle(l, b));
                    break;
                case 3:
                    System.out.print("Enter base and height: ");
                    double base = sc.nextDouble();
                    double h = sc.nextDouble();
                    shapes.add(new Triangle(base, h));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        double totalArea = 0;
        for (Shape2D s: shapes) {
            s.display();
            totalArea += s.calculateArea();
        }

        System.out.println("\nTotal area of figure = " + totalArea);
        sc.close();
    }
}