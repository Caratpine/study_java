package com.study.access;

import com.study.dessert.Cookie;
import static com.study.print.Print.*;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        print("ChocolateChip constructor");
    }

    public void chomp() {
        bite();
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
