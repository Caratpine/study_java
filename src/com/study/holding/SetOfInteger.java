package com.study.holding;

import java.util.*;

import static com.study.print.Print.print;

public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);

        Set<Integer> intSet = new HashSet<Integer>();

        for(int i = 0; i < 10000; i++)
            intSet.add(rand.nextInt(30));

        print(intSet);
    }
}
