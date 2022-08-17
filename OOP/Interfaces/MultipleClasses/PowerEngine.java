package Interfaces.MultipleClasses;

import Interfaces.MultipleClasses.Car;

public class PowerEngine implements Car {

    @Override
    public void start() {
        System.out.println("Power engine started");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stoppped");
    }

    @Override
    public void accelerate() {
        System.out.println("Power engine accelerated");
    }
}
