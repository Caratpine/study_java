package com.study.strings;

import static com.study.print.Print.print;

public class Immutable {
    public static void main(String[] args) {
        String q = "howdy";
        print(q);

        String qq = upCase(q);
        print(qq);
        print(q);
    }

    public static String upCase(String s) {
        return s.toUpperCase();
    }
}
