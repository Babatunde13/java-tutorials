package com.Babatunde.Inheritance;

import com.Babatunde.StaticExamples.*;

public class Nigerian extends Human {
    Nigerian (int age, String name, int salary, float height, boolean isMarried, Gender gender) {
        super(age, name, salary, height, isMarried, gender, "Nigeria");
    }

    public static void main(String[] args) {
        Nigerian babatunde = new Nigerian(
            20, "Babatunde Koiki", 500,
            5.7f, false, Gender.MALE
        );

        System.out.println(babatunde);
    }
}
