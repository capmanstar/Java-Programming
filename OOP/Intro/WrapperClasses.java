package Intro;

public class WrapperClasses {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

        //this are wrapper classes that treats primitive data types as objects.
        Integer a = 10;
        Integer b = 20;

        swap(a,b);
        System.out.println(a+" "+b);

        //Even in wrapper classes there is pass by referance but they are implemented as
        // final classes hence there are immutable once decalred.

    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
