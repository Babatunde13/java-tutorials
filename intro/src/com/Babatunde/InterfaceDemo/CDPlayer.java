package com.Babatunde.InterfaceDemo;

public class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Music Player started");
    }

    @Override
    public void stop() {
        System.out.println("Music Player stopped");
    }
    
}
