package com.study.access;

public class IceCream {
    public static void main(String[] args) {
        Sundae x = Sundae.makeSundae();
//        Sundae x = new Sundae();
    }
}

class Sundae {
    private Sundae() {}

    static Sundae makeSundae() {
        return new Sundae();
    }
}
