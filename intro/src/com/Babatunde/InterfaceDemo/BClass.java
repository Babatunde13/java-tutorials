package com.Babatunde.InterfaceDemo;

public class BClass implements B {
    @Override
    public void greet() {
        System.out.println("Hello");
    }

    @Override
    public void fun() {
        System.out.println("Fun");
    }
}
