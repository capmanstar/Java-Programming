package Inheritance;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car();
//        System.out.println(car.color);
//        System.out.println(car.company);
//        System.out.println(car.type);

//        Car car = new Car("Nissan","Sports","Red");
//        System.out.println(car.color);
//        System.out.println(car.company);
//        System.out.println(car.type);

//        Sedan gtr = new Sedan();
//        System.out.println(gtr.color);
//        System.out.println(gtr.company);
//        System.out.println(gtr.type);
//        System.out.println(gtr.engine);
//        System.out.println(gtr.price);


//        Sedan gtr = new Sedan("Nissan","Sport","Red",20000000,"Petrol");
//        System.out.println(gtr.color);
//        System.out.println(gtr.company);
//        System.out.println(gtr.type);
//        System.out.println(gtr.engine);
//        System.out.println(gtr.price)
        Car car = new Sedan(); //Below class knows everything about upper class
        car.type = "Hyper sport";


        //we can refer from base class to derived class but reverse is not possible.
//        Sedan sedan = new Car();


        SportCar sc = new SportCar();
//        System.out.println(sc.color);
//        System.out.println(sc.company);
//        System.out.println(sc.type);
//        System.out.println(sc.price);
//        System.out.println(sc.top_speed);
//        System.out.println(sc.engine);

        SportCar sc1 = new SportCar("Nissan","Sport","Red",20000000,"Petrol",500);
        System.out.println(sc1.color);
        System.out.println(sc1.company);
        System.out.println(sc1.type);
        System.out.println(sc1.price);
        System.out.println(sc1.top_speed);
        System.out.println(sc1.engine);
        System.out.println(sc1.top_speed);


    }
}
