public class TestPolygon {
    public void printArea(Rectangle r) {
        System.out.println("Polygon Type: " + r.getPolytype());
        System.out.println("Area of Rectangle " + r.calArea());
    }

    public void printArea(Triangle t) {
        System.out.println("Polygon Type: " + t.getPolytype());
        System.out.println("Area of Triangle: " + t.calArea());
    }
}