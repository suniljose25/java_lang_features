package records.ex2;


record Rectangle(double length, double width) {
    // Canonical form of the constructor
    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new java.lang.IllegalArgumentException(
                    String.format("Invalid dimensions: %f, %f", length, width));
        }
        this.length = length;
        this.width = width;
    }

    // Public accessor method
    public double length() {
        System.out.println("Length is " + length);
        return length;
    }

    // Static field
    static double goldenRatio;

    // Static initializer
    static {
        goldenRatio = (1 + Math.sqrt(5)) / 2;
    }

    // Static method
    public static Rectangle createGoldenRectangle(double width) {
        return new Rectangle(width, width * goldenRatio);
    }

    // Field declarations must be static:
    // BiFunction<Double, Double, Double> diagonal;

    // Instance initializers are not allowed in records:
    // {
    //     diagonal = (x, y) -> Math.sqrt(x*x + y*y);
    // }

    // Nested record class
    record RotationAngle(double angle) {
        public RotationAngle {
            angle = Math.toRadians(angle);
        }
    }

    // Public instance method
    public Rectangle getRotatedRectangleBoundingBox(double angle) {
        RotationAngle ra = new RotationAngle(angle);
        double x = Math.abs(length * Math.cos(ra.angle())) +
                Math.abs(width * Math.sin(ra.angle()));
        double y = Math.abs(length * Math.sin(ra.angle())) +
                Math.abs(width * Math.cos(ra.angle()));
        return new Rectangle(x, y);
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        System.out.println(new Rectangle(4, 5));
    }
}
