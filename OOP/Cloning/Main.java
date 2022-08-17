package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human darshan = new Human(21,"Darshan");
//        System.out.println(darshan.age);
//        System.out.println(darshan.name);


        //this uses extra space in the memory and hence not feasible
//        Human om = new Human(darshan);
//        System.out.println(om.age);
//        System.out.println(om.name);

        Human om = (Human) darshan.clone();
//        System.out.println(om.name);
//        System.out.println(om.age);
//        om.name = "Om";
//        System.out.println(om.name);
//        System.out.println(darshan.name);

        System.out.println(Arrays.toString(om.arr));
        om.arr[0] = 100;
        System.out.println(Arrays.toString(om.arr));
        //the arr also modified for original obj hence shallow copying.
        System.out.println(Arrays.toString(darshan.arr));
    }
}
