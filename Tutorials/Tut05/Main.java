public class Main{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle("MyRectangle", 5, 10);
        Triangle tri = new Triangle("MyTriangle",, 5, 8);

        TestPolygon tp = new TestPolygon(); // static binding, determined by the reference type, not the object type.
        tp.printArea(rect);
        tp.printArea(tri);
    }
}