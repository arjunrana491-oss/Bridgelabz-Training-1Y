package com.gla.ClassObject.Level1;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public double AreaOfCircle() {
        return 3.14 * radius * radius;
    }
    public double CircumferenceOfCircle() {
        return 3.14 * radius * 2;
    }

    public static void main() {
        Circle c1 = new Circle(20);
        System.out.println("Area of Circle c1: " + c1.AreaOfCircle());
        System.out.println("Circumference of circle c1: " + c1.CircumferenceOfCircle());
    }
}
