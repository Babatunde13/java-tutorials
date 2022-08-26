package com.Babatunde.StaticExamples;

public class Human {
    int age;
    String name;
    int salary;
    float height;
    boolean isMarried;
    Gender gender;
    static long population;

    public Human(int age, String name, int salary, float height, boolean isMarried, Gender gender) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.height = height;
        this.isMarried = isMarried;
        this.gender = gender;
        population++;
    }
}
