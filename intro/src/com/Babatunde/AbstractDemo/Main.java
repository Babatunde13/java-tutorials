package com.Babatunde.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Daughter daughter = new Daughter("Random");
        daughter.career("Doctor");
        daughter.partner("Babatunde", 30);
        daughter.normal();
        Daughter.test();

        Son son = new Son("Babatunde");
        son.career("Engineer");
        son.partner("Random", 30);
        son.normal();
        Son.test();

        // Parent parent = new Parent(); // Error: cannot instantiate an abstract class
    }
}
