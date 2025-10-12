public class Cuboid extends Shape3D {
    private double length, breadth, height;

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * (length * breadth + breadth *  height + length * height);
    }

    @Override
    public double calculateVolume() {
        return length * breadth * height;
    }

    @Override
    public void display() {
        System.out.println("Cuboid (length = " + length + " , breadth = " + breadth + " , height = " + height + ")");
    }
}