package com.study;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random(47);
        float f[] = new float[10];
        for(int i = 0; i < 10; i++) {
            f[i] = rand.nextFloat();
        }

        for (float x : f) {
            System.out.println(x);
        }

        for(char c : "An African Swallow.".toCharArray()) {
            System.out.print(c + " ");
        }

        for(int i = 0; i < 10; i++) {
            new Rock();
        }

        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }

        new Tree();
    }
}

class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}

class Tree {
    int height;

    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.print("Create new Tree that is " +
                height + " feet tall");
    }

    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}
