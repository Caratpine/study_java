package com.study;

class Banana {
    void peel(int i) {

    }
}

class Apricot {
    void pick() {}
    void pit() {pick();}
}

public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana(), b = new Banana();
        a.peel(1);
        b.peel(2);
        new Apricot();
    }
}