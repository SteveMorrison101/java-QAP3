public class Ellipse extends Shape {
    private double a; 
    private double b; 

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 >= axis2) {
            a = axis1;
            b = axis2;
        } else {
            a = axis2;
            b = axis1;
        }
    }

    public double getArea() {
        return Math.PI * a * b;
    }

    public double getPerimeter() {
        return Math.PI * 2 * (Math.sqrt((a * a + b * b) / 2));
    }

    public void scale(double factor) {
        a = a * factor;
        b = b * factor;
    }
}