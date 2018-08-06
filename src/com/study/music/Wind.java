package com.study.music;

import static com.study.print.Print.print;

public class Wind extends Instrument {
    public void play(Note n) {
        print("Wind.play() " + n);
    }
}
