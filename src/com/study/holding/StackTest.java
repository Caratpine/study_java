package com.study.holding;

import com.study.util.Stack;

import static com.study.print.Print.print;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        for(String s : "My dog has fleas".split(" "))
            stack.push(s);

        while(!stack.empty())
            print(stack.pop() + " ");
    }
}
