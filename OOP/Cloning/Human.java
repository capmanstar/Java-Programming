package Cloning;

import java.lang.management.ClassLoadingMXBean;

//to create copy or clone of object we implement Cloneable interface.
public class Human implements Cloneable{
    int age;
    String name;

    int[] arr;
    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4,5};
    }


//    public Human(Human other){
//        this.age = other.age;
//        this.name = other.name;
//    }



    //this cloning is called shallow cloning
    //means only primitive types are copyied
    //non-primitives ditect refer to obj of original object.
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    //this is called as deep copy
    @Override
    public Object clone() throws CloneNotSupportedException{
        Human om = (Human)super.clone(); //shallow cloning

        om.arr = new int[om.arr.length];
        for(int i = 0; i < om.arr.length; i++) {
            om.arr[i] = this.arr[i];
        }

        return om;
    }

}
