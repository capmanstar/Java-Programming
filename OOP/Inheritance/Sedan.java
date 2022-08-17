package Inheritance;

public class Sedan extends Car{

    int price;
    String engine;

    Sedan(String company, String type, String color,int price, String engine){
        super(company,type,color); //calls the constructor of the base class
        this.price = price;
        this.engine = engine;
    }

    Sedan(){
        super.color = null;  //we can access members of the base class using super keyword
//        super.company = null;  direct access of private members of base class is not possible;
        super.type = null;
        this.engine = null;
        this.price = -1;
    }


    Sedan(Sedan car){
        super(car);
    }
}
