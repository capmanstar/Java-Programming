package com.javacourse;

import java.util.Arrays;

public class var_args {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9);
        mult(2,3,"Darshan","Sonawane", "Dattatray");
    }
    
    static void fun(int ...v){ //variable length arguments means args with variable numbers.
        System.out.println(Arrays.toString(v));
    }

    static void mult(int a, int b, String ...v){ //with var args we can give different types of data as input in same function.

    }
}
