public class Circle extends Point {
    private double radius;
    
    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "Circle at " + super.toString() + " radius=" + radius;
    }
}