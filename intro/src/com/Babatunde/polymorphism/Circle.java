package com.Babatunde.polymorphism;

public class Circle extends Shape {
    private double radius;
    
    public static void log () {
        System.out.println("Circle");
    }

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
