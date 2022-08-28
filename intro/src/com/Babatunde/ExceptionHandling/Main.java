package com.Babatunde.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        System.out.println("");
        try {
            System.out.println(divide(a, b));
            String name = "Babatunde";
            if (name.equals("Babatunde")) {
                throw new MyException("Name is Babatunde");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is finally block");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}
