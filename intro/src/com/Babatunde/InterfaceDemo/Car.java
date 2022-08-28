package com.Babatunde.InterfaceDemo;

public class Car implements Brake, Engine {

    @Override
    public void start() {
        System.out.println("Car started"); 
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Car braked");
    }
    
}
