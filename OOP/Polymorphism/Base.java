package Polymorphism;

public class Base {

    String name;
    int age;


    Base(){
        this.name = null;
        this.age = -1;
    }

    Base(String name, int age){
        this.name = name;
        this.age = age;
    }


    //final methods can not be overridden but can be inherited
    final void greet1(){
        System.out.println("I am in a Base class");
    }

//    void greet(){
//        System.out.println("I am in a Base class");
//    }

    static void greet(){
        System.out.println("I am in a Base class");
    } //static methods can be inherited but can not be overridden.


}

//Final classes can not be inherited.
//public final class Base1 {
//
//    String name;
//    int age;
//
//
//    Base(){
//        this.name = null;
//        this.age = -1;
//    }
//
//    Base(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//
//    //final methods can not be overridden.
////    final void greet(){
////        System.out.println("I am in a Base class");
////    }
//
////    void greet(){
////        System.out.println("I am in a Base class");
////    }
//
//    static void greet(){
//        System.out.println("I am in a Base class");
//    }
//
//
//}

