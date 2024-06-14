package patternMatching;


/**
 * Pattern Matching for Switch
 */
class PatternMatchingForSwitch {
    public static void main(String[] args) {
        System.out.println(getDoubleUsingIf(1));
        System.out.println(getDoubleUsingIf(1.5));

        System.out.println(getDoubleUsingSwitch(1));
        System.out.println(getDoubleUsingSwitch(1.5));

        // System.out.println(describeValue(5));
        // System.out.println(describeValue(15));
        // System.out.println(describeValue(15L));
        // System.out.println(describeValue(15.8));
    }

    static double getDoubleUsingIf(Object o) {
        double result;
        if (o instanceof Integer) {
            result = ((Integer) o).doubleValue();
        } else if (o instanceof Float) {
            result = ((Float) o).doubleValue();
        } else if (o instanceof String) {
            result = Double.parseDouble(((String) o));
        } else {
            result = 0d;
        }
        return result;
    }

    static double getDoubleUsingSwitch(Object o) {
        return switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };
    }

    static String describeValue(Object o) {
        return switch (o) {
            case Integer i when i > 10 -> String.format("a large Integer %d", i);
            case Integer i             -> String.format("a small Integer %d", i);
            case Long l                -> String.format("a Long %d", l);
            default                    -> o.toString();
        };
    }
}
