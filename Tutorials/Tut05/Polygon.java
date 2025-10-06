package Tutorials.Tut05;
public abstract class Polygon {
    public enum KindofPolygon {
        POLY_PLAIN, POLY_RECT, POLY_TRIANG
    }
    
    protected String name;
    protected float width;
    protected float height;
    protected KindofPolygon polytype;
    
    public Polygon(String theName, float theWidth, float theHeight) {
        name = theName;
        width = theWidth;
        height = theHeight;
        polytype = KindofPolygon.POLY_PLAIN;
    }
    
    public KindofPolygon getPolytype() {
        return polytype;
    }
    
    public void setPolytype(KindofPolygon value) {
        polytype = value;
    }
    
    public String getName() {
        return name;
    }
    
    // part v: improvement to add abstract tag to the method and the class

    /* Why this requirement is appropriate
     * - Every polygon has an area, but each type computes it differently
     * - Making calArea() abstract ensures:
     *   - Every subclass must implement calArea()
     *   - The implementation is left to the subclasses
     *   - This allows for flexibility in area calculation without modifying the Polygon class
    */
    public abstract float calArea();
    
    public void printWidthHeight() {
        System.out.println("Width = " + width + " Height = " + height);
    }
}