package patternMatching.switchPatternMatching;

public class SwitchPatternMatchingSealedClasses {

    sealed interface S permits A, B, C { }
    final class A implements S { }
    final class B implements S { }
    record C(int i) implements S { }  // Implicitly final

    static int testSealedCoverage(S s) {
        return switch (s) {
            case A a -> 1;
            case B b -> 2;
            case C c -> 3;
            // no need for null or Object or default
        };
    }
}
