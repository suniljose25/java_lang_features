package patternMatching.instanceOfPatternMatching;


import patternMatching.instanceOfPatternMatching.lib.Circle;
import patternMatching.instanceOfPatternMatching.lib.Rectangle;
import patternMatching.instanceOfPatternMatching.lib.Shape;

public class WithPatternMatching {
    static class ShapeUtils {
        public static double getPerimeter(Shape shape) throws IllegalArgumentException {
            if (shape instanceof Rectangle r) {
                return 2 * r.length() + 2 * r.width();
            } else if (shape instanceof Circle c) {
                return 2 * c.radius() * Math.PI;
            } else {
                throw new IllegalArgumentException("Unrecognized shape");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(ShapeUtils.getPerimeter(new Circle(5)));;
    }
}
