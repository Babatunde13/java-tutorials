package com.Babatunde.InterfaceDemo;

public class PowerEngine implements Engine {
    
        @Override
        public void start() {
            System.out.println("PowerEngine started"); 
        }
    
        @Override
        public void stop() {
            System.out.println("PowerEngine stopped");
        }
    
        @Override
        public void accelerate() {
            System.out.println("PowerEngine accelerated");
        }
}
