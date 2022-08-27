package com.Babatunde.polymorphism;

public class Square extends Shape {
    private double side;
    
    public Square(double side) {
        super("Square");
        this.side = side;
    }
    
    @Override
    public double area() {
        return Math.pow(side, 2);
    }
    
    @Override
    public double perimeter() {
        return 4 * side;
    }  
}
