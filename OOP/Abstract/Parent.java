package Abstract;

public abstract class Parent {


    int var;

    //final methods can not be inherited.

    final void sample1(){
        System.out.println("I am a final method");
    }


    //we can declare and use static methods in abstract class.
    static void sample(){
            System.out.println("I am a static method");
    }

    abstract void career(String name);
    abstract void partner();



    //this constructor will be 1st to execute.
//    Parent(){
//        System.out.println("Abstract class constructor called.");
//    }

}
