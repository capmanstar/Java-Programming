package AccessModf2;

import AccessModifiers.Main;

public class Demo2 extends AccessModifiers.Main{
    protected String name;

    public static void main(String[] args) {

        Demo2 obj = new Demo2();

        obj.age = 13;
        obj.greet();
        obj.name();


        Main obj1 = new Demo2();


    }
}


class members extends Demo2{

    protected int salary;

    public static void main(String[] args) {
        members obj = new members();
        obj.name();
        obj.name = "Darshan";
    }
}
