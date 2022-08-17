package Interfaces.MultipleClasses;

public class Main implements Car, MusicPlayer, Brake {


    PowerEngine engine;
    CDPlayer player;

    @Override
    public void brake() {
        System.out.println("Brakes are applied.");
    }

    @Override
    public void start() {
        engine.start();
    }

    @Override
    public void stop() {
        engine.stop();
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerated");
    }


    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }


    public static void main(String[] args) {

        Main obj = new Main();
        obj.start();

        obj.accelerate();
        obj.brake();


    }
}



