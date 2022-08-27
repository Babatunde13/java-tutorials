package com.Babatunde.AccessControl;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(10, "Babatunde");
        System.out.println(random);
        System.out.println(random.getNum());
        System.out.println(random.name);
        System.out.println(random.arr);
    }
}
