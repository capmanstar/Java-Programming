package ExceptionHandling;

public class Demo {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        int c = a/b;


        //try block requires either catch block or finally block
//        try {
//            int c = a / b;
//        }
        //we can have multiple catch blocks.
        //if we 1st declare Exception class obj then we can not declare other types of exception.
//        catch(Exception e){
//            System.out.println(e.getMessage()); //It is a runtime exception.
//        }
        //specific types of exception should be declared 1st/
//        catch(ArithmeticException e){
//            System.out.println(e.getMessage()); //It is a runtime exception.
//        }
//        finally {
//            System.out.println("This block will always run if there is exception or not.");
//
//        }

//        int c = divide(a,b);
//        System.out.println(c);

        MyException me = new MyException();
        System.out.println(me);

    }


    //throws is used to declare the exception
    //throw is used to define or actually throw an exception.
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Do not divide by zero");
        }

        return a/b;

    }

}
