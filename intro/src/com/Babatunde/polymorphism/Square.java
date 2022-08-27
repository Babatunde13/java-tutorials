package com.Babatunde.polymorphism;

public class Square extends Shape {
    private double side;
    
    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public static void log () {
        System.out.println("Square");
    }
    
    @Override
    public double area() {
        return Math.pow(side, 2);
    }
    
    @Override
    public double perimeter() {
        return 4 * side;
    }

    // Cannot override the final method from Shape
    // @Override
    // void print() {
    //     System.out.println("Shape: " + name);
    //     System.out.println("Area: " + area());
    //     System.out.println("Perimeter: " + perimeter());
    // }
}
