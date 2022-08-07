package com.javacourse;

public class methods_params {
    public static void main(String[] args) {
        //int add = sum(123,123);
        //System.out.println(add);

        String message = msg("Darshan Sonawane");
        System.out.println(message);
    }

    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }

    static String msg(String name){
        String greet = "Hello " + name;
        return greet;
    }
}
