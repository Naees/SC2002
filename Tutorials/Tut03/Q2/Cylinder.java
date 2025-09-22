public class Cylinder extends Circle {
    private double height;

    public Cylinder(int x, int y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    // surface area = 2πr² + 2πrh
    public double area() {
        return 2 * Math.PI * getRadius() * getRadius() +
               2 * Math.PI * getRadius() * height;
    }

    // volume = πr²h
    public double volume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    public String toString() {
        return "Cylinder at " + super.toString() + " height=" + height;
    }
}