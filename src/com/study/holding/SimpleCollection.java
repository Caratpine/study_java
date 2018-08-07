package com.study.holding;

import java.util.*;

import static com.study.print.Print.print;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++)
            c.add(i);

        for(Integer i : c)
            print(i + ", ");
    }
}
