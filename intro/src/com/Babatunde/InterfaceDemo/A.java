package com.Babatunde.InterfaceDemo;

public interface A {
    void fun();
    default void hello () {
        System.out.println("Hello");
    }
}
