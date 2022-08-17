package Abstract;

public class child extends Parent{


    void value(int n){
        this.var = n;
        System.out.println(var);
    }

    child(){
        System.out.println("Child class constructor called");
    }

    @Override
    void career(String name){
        System.out.println("I wanted to be "+name);
    }

    @Override
    void partner(){
        System.out.println("I wanted partner of my choice");
    }


    void greet(){
        System.out.println("Hey there");
    }

}
