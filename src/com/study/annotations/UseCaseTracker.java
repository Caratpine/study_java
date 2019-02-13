package com.study.annotations;

import java.lang.reflect.*;
import java.util.*;

public class UseCaseTracker {
    private static void
    trackUseCases(List<Integer> useCases, Class<?> cl) {
        for (Method m: cl.getDeclaredMethods()) {
            UseCase us = m.getAnnotation(UseCase.class);
            if (us != null) {
                System.out.println("Found Use Case: " + us.id() + " " + us.description());
                useCases.remove(new Integer(us.id()));
            }
        }
        for (int i : useCases) {
            System.out.println("Warning: Missing use case" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 47, 48, 49, 50);
        trackUseCases(useCases, Testable.class);
    }
}
