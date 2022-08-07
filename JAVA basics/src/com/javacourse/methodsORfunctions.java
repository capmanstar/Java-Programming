package com.javacourse;

import java.util.Scanner;

public class methodsORfunctions {
    public static void main(String[] args) {
        int sum = sum();
        System.out.println("The sum is: "+sum);
    }

    //void means no value to return.
    static void sample() {
        System.out.println("This is sample method.");
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = in.nextInt();
        System.out.print("Enter number 2: ");
        int b =in.nextInt();
        int add = a+b;
        return add;
    }
}
