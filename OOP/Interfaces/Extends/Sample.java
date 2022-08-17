package Interfaces.Extends;


//have to implement methods of IF2 as well as IF1.
public class Sample implements IF2{
    @Override
    public void greet() {
        System.out.println("Greet");
    }

    @Override
    public void fun() {
        System.out.println("Fun");
    }
}
