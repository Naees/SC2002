public class TestPolygonDynamic {
    public void printArea(Polygon p) {
        System.out.println("Polygon Type: " + p.getName());
        System.out.println("Area of " + p.getPolytype() + " : " + p.calArea());
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle("MyRectangle", 5, 10);
        Triangle tri = new Triangle("MyTriangle",, 5, 8);

        TestPolygonDynamic tpd = new TestPolygonDynamic(); // static binding, determined by the reference type, not the object.
        tpd.printArea(rect);
        tpd.printArea(tri);
    }
}