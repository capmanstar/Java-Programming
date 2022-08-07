package com.javacourse;

public class type_convertion {
    public static void main(String [] args){
        //Type promotion
        byte b = 5;
        int i = 5000;
        float f = 52.16f;
        double d = 45161.12;
        char c = 'a';
        short s = 4513;

        double result = (f*b) + (i/c) - (d*s);
        System.out.println((f*b)); //b is promoted to f
        System.out.println((i/c)); //c is promoted to i
        System.out.println((d*s)); //s is promoted to d
        System.out.println(result);
    }
}
