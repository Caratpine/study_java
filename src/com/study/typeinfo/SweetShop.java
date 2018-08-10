package com.study.typeinfo;

import static com.study.print.Print.print;

class Candy {
    static {
        print("Loading Candy");
    }
}

class Gum {
    static {
        print("Loading Gum");
    }
}

class Cookie {
    static {
        print("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        print("inside main");
        new Candy();
        print("After creating Candy");
        try {
            Class.forName("Candy");
        } catch(ClassNotFoundException e) {
            print("Couldn't find Gum");
        }

    }
}


