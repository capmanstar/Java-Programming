package com.javacourse;

public class function_overloading {
    //function overloading means we declare two or more funcs with same name but use diffn params.
    public static void main(String[] args) {
        fun(12);
        fun("Darshan");
        sample(12,45);
        sample(50);

    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static void sample(int a){
        System.out.println(a);
    }

    static void sample(int b, int c){
        System.out.println(b + c);
    }
}
