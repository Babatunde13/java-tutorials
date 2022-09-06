package com.Babatunde.InterfaceDemo;

public interface B extends A {
    void greet();
    // static void greeting(); -> Error: static method cannot override an instance method
    // default void hello() { -> Error: default method cannot override an instance method

    static void greeting() {
        System.out.println("Hello there!");
    }
}
