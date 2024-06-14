package patternMatching.switchPatternMatching;

public class GeneralPoints {

    // Order of cases with subclasses matters
    static double getDoubleUsingSwitch(Object o) {
        return switch (o) {
            case String s -> Double.parseDouble(s);
            case CharSequence c -> Double.parseDouble(c.toString());
            default -> 0d;
        };
    }

    // This can handle null cases
    static double getDoubleUsingSwitchWithNull(Object o) {
        return switch (o) {
            case String s -> Double.parseDouble(s);
            case null -> 0d;
            default -> 0d;
        };
    }

    // If no null, then use Object
    // If no null or Object, then if "o" is null, then switch will throw a NullPointerException
    static double getDoubleUsingSwitchTotalType(Object o) {
        return switch (o) {
            case String s -> Double.parseDouble(s);
            case Object ob -> 0d;
        };
    }

}
