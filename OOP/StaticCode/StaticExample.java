package StaticCode;

public class StaticExample {
    public static void main(String[] args) {

//        greeting();
        StaticExample obj = new StaticExample();
        obj.sayHello();

    }

    void greeting(){
//        String[] arr = new String[5];
        System.out.println("Hello world");
//        main(arr);
    }


    //we can call non-static method inside a non-static method directly.
    void sayHello(){
        greeting();
        sample(); //we can call a static method in a non-static method.
    }


    static void sample(){
        System.out.println("This is a static method");
    }
}
