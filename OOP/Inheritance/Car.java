package Inheritance;

public class Car {
    String company;
    String type;
    String color;


    Car(){
        super(); //it is calling constructor of the object class.
        this.color = null;
        this.type = null;
        this.company = null;
    }

    Car(String company, String type, String color){
        this.company = company;
        this.color = color;
        this.type = type;
    }


    Car(Car other){
        this.company = other.company;
        this.color = other.color;
        this.type = other.type;
    }

}
