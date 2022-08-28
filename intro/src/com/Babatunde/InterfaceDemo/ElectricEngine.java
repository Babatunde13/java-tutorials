package com.Babatunde.InterfaceDemo;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine started");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric engine accelerated");
    }
    
}
