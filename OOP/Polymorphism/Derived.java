package Polymorphism;

public class Derived extends Base{

    int salary;

    Derived(){
        super();
        this.salary = 0;
    }

    Derived(String name,int age, int salary){
        super(name,age);
        this.salary = salary;
    }

//    @Override  //this is annotation to check override is done or not.
//    static void greet(){
//        System.out.println("I am in a Derived class");
//    }



}
