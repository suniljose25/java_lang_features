package patternMatching.switchPatternMatching;


public class ParenthesizedPatterns {

    static double testPattern(Object o) {
        return switch (o) {
            // Can use parantheses to make them readable and also group them
            case String s when s.length() > 0 && !(s.contains("#") || s.contains("@")) -> Double.parseDouble(s);
                default -> 0d;
        };
    }
}
