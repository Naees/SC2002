package Template.Tutorial3;
public class Circle extends Point{
    private double radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle (double radius) {
        super();
        this.radius = radius;
    }

    public Circle(int x, int y, double rad) {
        super(x, y);
        this.radius = rad;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "Circle of radius " + radius + " at point [ " + getX() + " , " + getY() + " ]";
    }
}