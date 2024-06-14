package patternMatching.instanceOfPatternMatching;

import patternMatching.instanceOfPatternMatching.lib.Circle;
import patternMatching.instanceOfPatternMatching.lib.Rectangle;
import patternMatching.instanceOfPatternMatching.lib.Shape;


public class WithoutPatternMatching {

    static class ShapeUtils {
        public static double getPerimeter(Shape shape) throws IllegalArgumentException {
            if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                return 2 * r.length() + 2 * r.width();
            } else if (shape instanceof Circle) {
                return 2 * ((Circle) shape).radius() * Math.PI;
            } else {
                throw new IllegalArgumentException("Unrecognized shape");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(ShapeUtils.getPerimeter(new Circle(5)));;
    }
}
