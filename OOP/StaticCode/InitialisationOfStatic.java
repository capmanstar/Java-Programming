package StaticCode;

public class InitialisationOfStatic {
    static int a = 10;
    static int b;

    //static block is only called once.
    static{
        System.out.println("This is a static block");
        b = a*2;
    }

    public static void main(String[] args) {
        InitialisationOfStatic obj = new InitialisationOfStatic();
        System.out.println(a+" "+b);
        InitialisationOfStatic obj1 = new InitialisationOfStatic();
        b = b+3;
        System.out.println(a+" "+b);
        InitialisationOfStatic obj2 = new InitialisationOfStatic();
        System.out.println(a+" "+b);
    }
}
