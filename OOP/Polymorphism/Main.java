package Polymorphism;

public class Main {

    public static void main(String[] args) {
//        Base obj = new Base("Darshan",21);
        Derived obj1 = new Derived("Darshan",21,100000);

//        System.out.println(obj.name);
//        System.out.println(obj1.salary);


//        Base ref = new Derived();  //Run time polymorphism or dynamic polymorphism.
//        ref.greet();

        obj1.greet();
//        obj.greet();

        obj1.greet1();


    }
}
