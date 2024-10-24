package com.beans;

public class Rectangle extends Shape {
    private float length, breadth;

    public Rectangle() {
        super();
    }

    public Rectangle(String color, float length, float breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    public float calcArea() {
        return length * breadth;
    }

    public float calcPerimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public String toString() {
        return super.toString() + " Rectangle [length=" + length + ", breadth=" + breadth + "]";
    }
}