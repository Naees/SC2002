package Template.Tutorial3;
public class Cylinder extends Circle{
    private double height;
    
    public Cylinder(){
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

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

    public double area() {
        return 2 * super.area() + 2 * Math.PI * getRadius() * height;
    }

    public double volume() {
        return super.area() * height;
    }

    public String toString() {
        return "Cylinder of height " + height + " , radius " + getRadius() + " at point [ " + super.getX() + " , " + super.getY() + " ]";
    }
}