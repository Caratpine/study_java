package com.study.holding;

import java.util.*;

import static com.study.print.Print.print;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};

        collection.addAll(Arrays.asList(moreInts));

        for(Integer v : collection)
            print(v);
    }
}
