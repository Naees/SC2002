package Template.Tutorial2;
public class Circle {
    private double radius;
    private static final double PI = 3.14159;

    // Constructor
    public Circle(double rad) {
        this.radius = rad;
    }

    public void setRadius(double rad) {
        this.radius = rad;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double circumference() {
        return 2 * PI * radius;
    }

    public void printArea() {
        System.out.println("Area of circle");
        System.out.printf("Radius: %.2f\n", radius);
        System.out.printf("Area: %.4f\n",area());
    }

    public void printCircumference() {
        System.out.println("Circumference of circle");
        System.out.printf("Radius: %.2f\n", radius);
        System.out.printf("Circumference: %.4f\n",circumference());
    }
}