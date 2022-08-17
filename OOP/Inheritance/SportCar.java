package Inheritance;

public class SportCar extends Sedan{

    double top_speed;

    SportCar(){
        super();
        this.top_speed = 0.0;
    }

    SportCar(String company, String type, String color,int price, String engine,double top_speed){
        super(company,type,color,price,engine);
        this.top_speed = top_speed;
    }

}
