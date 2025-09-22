public class TestCases {
    public static void main(String[] args) {

        Circle c = new Circle(5, 6, 7.0);
        System.out.println(c);
        c.setRadius(8.0);
        System.out.println("radius = " + c.getRadius());
        System.out.printf("area = %.2f\n", c.area());

        Cylinder cyl = new Cylinder(9, 10, 11.0, 12.0);
        System.out.println(cyl);
        cyl.setHeight(13.0);
        System.out.println("height = " + cyl.getHeight());
        System.out.printf("area = %.2f\n", cyl.area());
        System.out.printf("volume = %.2f\n", cyl.volume());
    }
}