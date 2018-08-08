package com.study.holding;

import java.util.*;

import static com.study.print.Print.print;

public class QueueDemo {
    public static void printQ(Queue queue) {
        while(queue.peek() != null)
            print(queue.remove() + " ");
        print();
    }

    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for(int i = 0; i < 10; i++)
            queue.offer(rand.nextInt(i + 10));

        printQ(queue);

        Queue<Character> qc = new LinkedList<Character>();
        for(char c : "Brontosaurus".toCharArray())
            qc.offer(c);

        printQ(qc);
    }
}
