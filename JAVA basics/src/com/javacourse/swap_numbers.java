package com.javacourse;

public class swap_numbers {
    public static void main(String[] args) {
        int a = 10, b=20;

        int temp = a;
        a=b;
        b=temp;

        System.out.println(a+" "+b);
    }
}
