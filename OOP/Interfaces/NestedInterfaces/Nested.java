package Interfaces.NestedInterfaces;

public class Nested {

    public interface nested{
        boolean isOdd(int n);
    }

}


class A implements Nested.nested{


    @Override
    public boolean isOdd(int n) {
        return (n&1) == 1;
    }
}

