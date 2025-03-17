public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle("Circle", 5);
        shapes[1] = new Ellipse("Ellipse", 7, 5);
        shapes[2] = new Triangle("Triangle", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);

        System.out.println("Before Scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        scaleShapes(shapes, 2);

        System.out.println("\nAfter Scaling by Factor 2:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    // Scale all scalable shapes in the array
    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}