package com.Babatunde.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human2 babatunde = new Human2(20, "Babatunde", new int[] {1, 2, 3});
        Human2 twin = (Human2)babatunde.clone();

        System.out.println(twin.age);
        System.out.println(twin.name);

        babatunde.marks[0] = 5;

        System.out.println(babatunde.marks[0]);
        System.out.println(twin.marks[0]);

    }
}
