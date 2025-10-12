public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    // surface area helper (not part of the Shape3D public API)
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Sphere (radius = " + radius + ")");
    }
}