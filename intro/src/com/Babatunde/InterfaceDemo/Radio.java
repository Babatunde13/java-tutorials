package com.Babatunde.InterfaceDemo;

public class Radio implements Media {

    @Override
    public void start() {
        System.out.println("Radio started");
    }

    @Override
    public void stop() {
        System.out.println("Radio stopped");
    }
}
