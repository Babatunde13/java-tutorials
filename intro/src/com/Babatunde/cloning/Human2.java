package com.Babatunde.cloning;

public class Human2 implements Cloneable {
    int age;
    String name;
    int[] marks;

    public Human2(int age, String name, int[] marks) {
        this.age = age;
        this.marks = marks;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // -> shallow copy
    }

    @Override
    public String toString() {
        return "Human2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //     // Deep copy implementation
    //     Human2 clone = (Human2)super.clone();
    //     clone.marks = new int[this.marks.length];
    //     for (int i = 0; i < this.marks.length; i++) {
    //         clone.marks[i] = this.marks[i];
    //     }
    //     return clone;
    // }
}