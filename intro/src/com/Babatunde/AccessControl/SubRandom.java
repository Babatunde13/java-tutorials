package com.Babatunde.AccessControl;

public class SubRandom extends Random {
    public SubRandom (int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubRandom subRandom = new SubRandom(10, "Babatunde");

        System.out.println(subRandom);
        // System.out.println(subRandom.num);
        System.out.println(subRandom.getNum());
        System.out.println(subRandom.name);
        System.out.println(subRandom.arr);
    }
}
