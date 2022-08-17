package Abstract;

public class Main {

    public static void main(String[] args) {


//        we can not create obj of the abstract class.
//        Parent p = new Parent() {}

        child obj = new child();
//        obj.career("Engineer");
//        obj.partner();
//        obj.greet();

//        Parent.sample(); //static method calling.
//        obj.sample1();

        obj.value(13);

    }
}
