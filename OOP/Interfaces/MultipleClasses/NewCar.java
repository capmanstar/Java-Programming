package Interfaces.MultipleClasses;

public class NewCar{

    private PowerEngine engine;
    private MusicPlayer player = new CDPlayer();

    public NewCar(){
        engine = new PowerEngine();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void accelerate(){
        engine.accelerate();
    }

    public void startPlayer(){
        player.start();
    }

    public void stopPlayer(){
        player.stop();
    }


    public static void main(String[] args) {

        NewCar car = new NewCar();
        car.start();
        car.startPlayer();
        car.accelerate();
        car.stop();
        car.stopPlayer();

    }

}
