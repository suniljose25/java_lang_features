package patternMatching.switchPatternMatching;

import patternMatching.switchPatternMatching.lib.Circle;
import patternMatching.switchPatternMatching.lib.Rectangle;
import patternMatching.switchPatternMatching.lib.Shape;

/**
 * Pattern Matching for Switch
 */
class PatternMatchingForSwitch {
    static class ShapeUtils {
        public static double getPerimeter(Shape shape) throws IllegalArgumentException {
            return switch (shape) {
                case Circle c -> 2 * c.radius() * Math.PI;
                case Rectangle r -> 2 * r.length() + 2 * r.width();
                default -> throw new IllegalArgumentException("Unrecognized shape");
            };
        }
    }

    public static void main(String[] args) {
        System.out.println(ShapeUtils.getPerimeter(new Circle(5)));;
    }
}
