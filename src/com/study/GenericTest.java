package com.study;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void getData(List<?> data) {
        System.out.println(data.get(0));
    }

    public static void getUpperNumber(List<? extends Number> data) {
        System.out.println(data.get(0));
    }

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(321);

        getUpperNumber(age);
        getUpperNumber(number);
    }
}
