package com.study.reusing;

import static com.study.print.Print.*;

public class SpringklerSystem {
    public static void main(String[] args) {
        SpringklerSystem sprinklers = new SpringklerSystem();
        print(sprinklers);
    }
    private String value1, value2, value3, value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        return
                "value1 = " + value1 + " " +
                "value2 = " + value2 + " " +
                "value3 = " + value3 + " " +
                "value4 = " + value4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source;
    }
}

class WaterSource {
    private String s;
    WaterSource() {
        print("WaterSource()");
        s = "Constructed";
    }
    public String toString() {
        return this.s;
    }
}
