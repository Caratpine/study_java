package com.study.music;

import com.study.music.Note;

import static com.study.print.Print.print;

public class Music4 {
    public static void main(String[] args) {

    }
}

abstract class InstrumentA {
    private int i;

    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class WindA extends InstrumentA {
    public void play(Note n) {
        print("Wind.play() " + n);
    }

    public String what() {
        return "Wind";
    }

    public void adjust() {}
}

class PercussionA extends InstrumentA {
    public void play(Note n) {
        print("Percussion.play() " + n);
    }

    public String what() {
        return "Percussion";
    }

    public void adjust() {

    }
}

class Stringed extends InstrumentA {
    public void play(Note n) {
        print("Stringed.play() " + n);
    }

    public String what() {
        return "Stringed";
    }

    public void adjust() {}

}

class Brass extends WindA {
    public void play(Note n) {
        print("Brass.play() "+ n);
    }

    public void adjust() {
        print("Brass.adjust()");
    }
}

class Woodwind extends Wind {
    public void play(Note n) {
        print("Woodwind.play() " + n);
    }

    public String what() {
        return "Woodwind";
    }
}

