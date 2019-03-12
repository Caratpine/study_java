package generics;

import java.util.List;
import java.util.Map;

public class ExplicitTypeSpecification {
    static void f(Map<String, List<String>> p) {}

    public static void main(String[] args) {
        f(New.<String, List<String>>map());
    }
}
