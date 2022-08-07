package com.javacourse;

public class scope_2 {
    public static void main(String[] args) {
        int a = 10;

        {
          a = 99; //we can not initialize the object already initialized outside the block. BUt can be changed.
          int b = 20;
        }
        int b = 200;
        System.out.println(b); //we can not this as it as it is outside the block.
    }
}
