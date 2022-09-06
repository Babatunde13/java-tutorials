package com.Babatunde;

import java.util.ArrayList;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach((i) -> System.out.println(i));
        System.out.println("==============================");
        list.forEach(System.out::println);

        System.out.println("==============================");
        LambdaFunction myCalculator = new LambdaFunction();

        System.out.println(myCalculator.operate(1, 2, myCalculator.sum));
        System.out.println(myCalculator.operate(1, 2, myCalculator.sub));
        System.out.println(myCalculator.operate(1, 2, myCalculator.mul));
        System.out.println(myCalculator.operate(1, 2, myCalculator.div));
    }

    Operation sum = (a, b) -> a + b;
    Operation sub = (a, b) -> a - b;
    Operation mul = (a, b) -> a * b;
    Operation div = (a, b) -> a / b;

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}