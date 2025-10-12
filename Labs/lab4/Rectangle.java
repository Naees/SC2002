public class Rectangle extends Shape2D {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public void display() {
        System.out.println("Rectangle (length = " + length + " , breadth = " + breadth + ") ");
    }
}