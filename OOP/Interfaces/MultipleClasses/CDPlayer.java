package Interfaces.MultipleClasses;

public class CDPlayer implements MusicPlayer {


    @Override
    public void start() {
        System.out.println("Music started");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped");
    }
}
