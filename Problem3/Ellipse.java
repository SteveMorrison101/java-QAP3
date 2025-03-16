public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        // Ensure a is always the larger axis
        if (axis1 >= axis2) {
            a = axis1;
            b = axis2;
        } else {
            a = axis2;
            b = axis1;
        }
    }

    // Calculate ellipse area
    public double getArea() {
        return Math.PI * a * b;
    }

    // Calculate ellipse perimeter
    public double getPerimeter() {
        return Math.PI * 2 * (Math.sqrt((a * a + b * b) / 2));
    }
}