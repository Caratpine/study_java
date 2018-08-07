package com.study.holding;

import java.util.*;

import static com.study.print.Print.print;

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Braeburn());

        for(Apple c: apples) {
            print(c);
        }
    }
}

class GrannySmith extends Apple {}

class Gala extends Apple {}

class Braeburn extends Apple {}
