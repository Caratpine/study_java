package generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.oldWay();
        lambda.newWay();
    }

    private void oldWay() {
        String[] s = "Improving code with Lambda expressions in Java 8".split(" ");

        Arrays.sort(s, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.toLowerCase().compareTo(o2.toLowerCase());
            }
        });
        System.out.println(String.join(", ", s));
    }

    private void newWay() {
        String[] s = "Improving code with Lambda expressions in Java 8".split(" ");
        Arrays.sort(s, (s1, s2) -> {
            return s1.toLowerCase().compareTo(s2.toLowerCase());
        });
        System.out.println(String.join(", ", s));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(v -> {
            System.out.println(v);
        });
    }
}
