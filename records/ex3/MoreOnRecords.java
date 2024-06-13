package records.ex3;

import java.lang.annotation.*;


record Triangle<C extends Coordinate> (C v1, C v2, C v3) { }

record Quad<C extends Coordinate> (C v1, C v2, C v3, C v4) { }

record Square(int side) implements Shape { }

record Rectangle(
        @GreaterThanZero double length,
        @GreaterThanZero double width) { }

//public final class Rectangle {
//    private final @GreaterThanZero double length;
//    private final @GreaterThanZero double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    double length() { return this.length; }
//    double width() { return this.width; }
//}









@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface GreaterThanZero { }


interface Shape {}

record Coordinate(int x, int y) {}