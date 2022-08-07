package com.javacourse;

public class shadowing {
    static int x = 90; //this will shadowed at line 7
    public static void main(String [] args){
        System.out.println(x);
        int x = 40; //the class var at line 4 is shadowed here
        System.out.println(x);

        int y; //declaring the var
        y = 50; //initializing the var
        System.out.println(y);

        fun();

    }

    static void fun(){
        System.out.println(x); //class var used here.
    }
}
