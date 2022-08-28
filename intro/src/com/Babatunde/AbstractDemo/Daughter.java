package com.Babatunde.AbstractDemo;

public class Daughter extends Parent {

    public Daughter (String name) {
        super(name);
    }

    @Override
    void career(String name) {
        System.out.println("I am a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " and he is " + age + " years old");
    }
}
