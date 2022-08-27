package com.Babatunde.StaticExamples;

public class Human {
    int age;
    String name;
    int salary;
    float height;
    boolean isMarried;
    Gender gender;
    static long population;
    String country;

    public Human(int age, String name, int salary, float height, boolean isMarried, Gender gender) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.height = height;
        this.isMarried = isMarried;
        this.gender = gender;
        this.country = "USA";
        population++;
    }

    public Human(int age, String name, int salary, float height, boolean isMarried, Gender gender, String country) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.height = height;
        this.isMarried = isMarried;
        this.gender = gender;
        this.country = country;
        population++;
    }

    public String toString() {
        return this.name + " is from " + this.country + ", and is " + this.age + " years old.";
    }
}
