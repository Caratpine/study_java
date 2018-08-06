package com.study;

import com.study.dessert.Cake;

import static com.study.print.Print.print;

public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");

    public Frog() {
        print("Frog()");
    }

    protected void dispose() {
        print("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        print("Bye!");
        frog.dispose();
    }
}

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        print("Creating Characteristic " + s);
    }

    protected void dispose() {
        print("disposing Characteristic " + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        print("Creating Description " + s);
    }

    protected void dispose() {
        print("disposing Description " + s);
    }
}

class LivingCreature {
    private Characteristic p = new Characteristic("is alive");
    private Description t = new Description("Basic Living Creature");

    LivingCreature() {
        print("LivingCreature()");
    }

    protected void dispose() {
        print("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("Animal not Vegatable");

    Animal() {
        print("Animal()");
    }

    protected void dispose() {
        print("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");

    Amphibian() {
        print("Amphibian()");
    }

    protected void dispose() {
        print("Amphbian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}