package com.Babatunde.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box);
        System.out.println(box.volume() + "cm^3");

        Cube cube = new Cube(5);
        System.out.println(cube);
        System.out.println(cube.volume() + "cm^3");

        BoxWeight box2 = new BoxWeight(10, 10, 10, 10);
        System.out.println(box2);
        System.out.println(box2.volume() + "cm^3");
        System.out.println(box2.density() + "kg/cm^3");
    }
}
