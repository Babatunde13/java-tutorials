package com.Babatunde.InterfaceDemo;

public class NiceCar {
    private Engine engine;
    private Media media;

    public NiceCar(Engine engine, Media media) {
        this.engine = engine;
        this.media = media;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void accelerate() {
        engine.accelerate();
    }

    public void startMusic() {
        media.start();
    }

    public void stopMusic() {
        media.stop();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }

    public void upgradeMedia(Media media) {
        this.media = media;
    }

    public static void main(String[] args) {
        System.out.println("");
        NiceCar niceCar = new NiceCar(new PowerEngine(), new Radio());

        niceCar.start();
        niceCar.startMusic();
        niceCar.accelerate();
        niceCar.stopMusic();
        niceCar.stop();
        System.out.println("");

        niceCar.upgradeEngine(new ElectricEngine());
        niceCar.upgradeMedia(new CDPlayer());
        niceCar.start();
        niceCar.startMusic();
        niceCar.accelerate();
        niceCar.stopMusic();
        niceCar.stop();
    }
}
