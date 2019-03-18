package generics;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda {
    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.oldWay();
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
}
