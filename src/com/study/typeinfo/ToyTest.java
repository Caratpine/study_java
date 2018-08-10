package com.study.typeinfo;

import static com.study.print.Print.print;

public class ToyTest {
    public static void main(String[] args) {
        Toy toy = new Toy();
        toy.say();
    }
}

class Toy {
    Toy() {}
    Toy(int i) {}

    @Deprecated
    public void say() {
        print("hello world");
    }

    public void speak() {
        print("aaa");
    }
}

@interface TestAnnotation {
    String value();
}

@TestAnnotation("hi")
class Test extends Toy {

    @Override
    public void speak() {}
}
