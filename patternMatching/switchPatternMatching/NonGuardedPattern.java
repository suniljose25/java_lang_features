package patternMatching.switchPatternMatching;

import patternMatching.switchPatternMatching.lib.Circle;
import patternMatching.switchPatternMatching.lib.Rectangle;
import patternMatching.switchPatternMatching.lib.Shape;

/**
 * Pattern Matching for Switch
 */
class NonGuardedPattern {
    static class StringUtils {
        public static String test(Object value) {
            switch (value) {
                case String s:
                    if (s.length() == 1) {
                        return "it's very short";
                    } else if (s.length() < 5) {
                        return "it's short";
                    }
                    return "it's long";
                default: throw new IllegalArgumentException("It's not a string");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.test("a"));
        System.out.println(StringUtils.test("java"));
        System.out.println(GuardedPattern.StringUtils.test("Python"));
    }
}
