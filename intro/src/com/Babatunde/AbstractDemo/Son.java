package com.Babatunde.AbstractDemo;

public class Son extends Parent {

    public Son (String name) {
        super(name);
    }

    @Override
    void career(String name) {
        System.out.println("I am a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " and she is " + age + " years old");
    }
}
