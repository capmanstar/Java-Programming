package com.javacourse;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //System.out.println(marks); //we can not access the var decalred in another functions.
    }

    static void sample_functions(int marks){ // scope f this is only in this method only.
        System.out.println(marks);
    }
}
