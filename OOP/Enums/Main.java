package Enums;

public class Main {

    //enum is a group of constants
    //they are public static final by default.
    //enum can't be a super class.

    //enum only extends Enum class
    //enum can implement any interface.
    enum Week implements demo{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        //calls every var in it.
        Week(){
            System.out.println("This is constructor for "+this);
        }

        @Override
        public void hello() {
            System.out.println("Hello");
        }
    }


    public static void main(String[] args) {

        //enum can not be instantiated
        Week week;
        week = Week.Friday;
//        System.out.println(week);
        week.hello();
        System.out.println(week.ordinal());
//        System.out.println(week.values());
//        System.out.println(week.valueOf());

    }
}
