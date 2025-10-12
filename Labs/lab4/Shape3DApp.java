import java.util.*;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape3D> shapes = new ArrayList<>();

        System.out.print("Enter total number of 3D shape: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("\nChoose shape: 1) Sphere 2) Cuboid 3) Cone 4) Cylinder");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter radius");
                    shapes.add(new Sphere(sc.nextDouble()));
                    break;
                case 2:
                    System.out.println("Enter length, breadth, height: ");
                    shapes.add(new Cuboid(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                    break;
                case 3:
                    System.out.println("Enter radius, height: ");
                    shapes.add(new Cone(sc.nextDouble(), sc.nextDouble()));
                case 4:
                    System.out.println("Enter radius and height: ");
                    shapes.add(new Cylinder(sc.nextDouble(),sc.nextDouble()));
                default:
                    System.out.println("Invalid choice");
            }
        }
        double totalSurfaceArea = 0;
        double totalVolume = 0;

        for (Shape3D s : shapes) {
            s.display();
            totalSurfaceArea += s.calculateSurfaceArea();
            totalVolume += s.calculateVolume();
        }
        System.out.println("\nTotal surface area of figure = " + totalSurfaceArea);
        System.out.println("Total volume of figure = " + totalVolume);
        sc.close();
    }
}