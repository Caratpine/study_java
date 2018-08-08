package com.study.util;

import java.util.LinkedList;

public class Stack<fuck> {
    private LinkedList<fuck> storage = new LinkedList<fuck>();

    public void push(fuck v) {
        storage.addFirst(v);
    }

    public fuck peek() {
        return storage.getFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public fuck pop() {
        return storage.removeFirst();
    }

    public String toString() {
        return storage.toString();
    }
}
