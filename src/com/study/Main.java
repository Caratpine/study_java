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
    }
}

class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}
