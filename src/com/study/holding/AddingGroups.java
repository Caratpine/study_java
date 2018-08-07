package com.study.holding;

import java.util.*;

import static com.study.print.Print.print;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};

        collection.addAll(Arrays.asList(moreInts));

//        for(Integer v : collection)
//            print(v);

        Collections.addAll(collection, 11, 12, 13);
        Collections.addAll(collection, moreInts);

        List<Integer> list = Arrays.asList(16, 17, 18);
        list.set(1, 99);
        list.add(21);

        for(Integer v : list)
            print(v);
    }
}
