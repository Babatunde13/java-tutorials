package com.Babatunde.InterfaceDemo.Nested;

public class A {
    public interface B {
        boolean isOdd(int number);
    }
}

class B implements A.B {
    @Override
    public boolean isOdd(int number) {
        return number % 2 == 1;
    }
}