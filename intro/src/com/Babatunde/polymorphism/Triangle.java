package com.Babatunde.polymorphism;

public class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double area() {
        return 0.5 * base * height;
    }
    
    @Override
    public double perimeter() {
        return base + height + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
}
