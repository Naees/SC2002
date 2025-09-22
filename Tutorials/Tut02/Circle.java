public class Circle {
    private double radius;
    private static final double PI = 3.14159;

    // constructor
    public Circle(double rad) {
        this.radius = rad;

     }

    // mutator method - set radius
    public void setRadius(double rad) {
        this.radius = rad;
    }

    // accessor method - get radius
    public double getRadius() {
        return this.radius;
    }

    // calculate area
    public double area() {
        return Math.PI * radius * radius;     
    }

    // calculate circumference
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    // print area
    public void printArea() {
        System.out.printf("Area: %f%n", area());
    }

    // print circumference
    public void printCircumference() {
        System.out.printf("Circumference: %f%n", circumference());
    }
}