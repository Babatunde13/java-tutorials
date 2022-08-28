package com.Babatunde.StaticExamples;

import com.Babatunde.InterfaceDemo.A;

public class Main {
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        @Override
        public void fun() {
            System.out.println("Fun");
        }
    }
    public static void main(String[] args) {
        Human babatunde = new Human(
            20, "Babatunde Koiki", 500,
            5.7F, false, Gender.MALE
        );

        Human human2 = new Human(
            19, "User 2", 500,
            5.6F, false, Gender.FEMALE
        );

        babatunde.toString();
        System.out.println(human2);
        StringBuilder a = new StringBuilder("");
        a.append("Babatunde");
        System.out.println(a);
        System.out.println(Human.population);

        Week monday = Week.Monday;
        System.out.println(monday);
        for (Week day : Week.values()) {
            System.out.println(day);
        }
        monday.fun();
    }
}
