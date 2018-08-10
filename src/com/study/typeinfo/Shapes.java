package com.study.typeinfo;

import java.util.*;

import static com.study.print.Print.print;

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );

        for(Shape shape : shapeList)
            shape.draw();
    }
}

abstract class Shape {
    void draw() {
        print(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}
