package com.Babatunde.polymorphism;

public class Shape {
    String name;

    static void log () {
        System.out.println("Shape");
    }

    public Shape (String name) {
        this.name = name;
    }

    // Early binding
    double area () {
        return 0;
    }

    double perimeter () {
        return 0;
    }

    /**
     * This method is defined with the final keyword, so it cannot be overridden by subclasses.
     */
    final void print () {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}
