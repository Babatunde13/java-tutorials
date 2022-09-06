package com.Babatunde.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Quadrilateral");
        System.out.println(shape.area());
        
        Circle circle = new Circle(5.7);
        System.out.println(circle.area());
        
        Triangle triangle = new Triangle(5.7, 10.9);
        System.out.println(triangle.area());
        
        Square square = new Square(4.5);
        System.out.println(square.area());

        Shape.log();
        Circle.log();
        Triangle.log();
        Square.log();
    }

    // Types of polymorphism
    // 1. Static/Compile time Polymorphism -> Method Overloading
    // 2. Dynamic/Runtime Polymorphism -> Method Overriding
}
