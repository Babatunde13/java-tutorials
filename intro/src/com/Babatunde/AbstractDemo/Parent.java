package com.Babatunde.AbstractDemo;

public abstract class Parent {
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    // abstract Parent() {
    //     System.out.println("Parent constructor");
    // } // Error: abstract classes cannot have constructors

    abstract void career (String name);
    abstract void partner (String name, int age);
    static void test () {
        System.out.println("Parent test");
    }

    void normal () {
        System.out.println("This is a normal method. " + this.name);
    }

    // abstract static void hello(); -> Error: cannot create an abstract static method
}
