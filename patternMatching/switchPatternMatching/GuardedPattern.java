package patternMatching.switchPatternMatching;


public class GuardedPattern {

    static class StringUtils {
        public static String test(Object value) {
            return switch (value) {
                case String s when s.length() == 1 -> "it's very short";
                case String s when s.length() < 5 -> "it's short";
                case String s -> "it's long";
                default -> throw new IllegalArgumentException("It's not a String");
            };
        }
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.test("a"));
        System.out.println(StringUtils.test("java"));
        System.out.println(StringUtils.test("Python"));
    }
}
