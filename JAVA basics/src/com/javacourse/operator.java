package com.javacourse;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        float num1 = in.nextFloat();
        System.out.print("Enter number 2: ");
        float num2 = in.nextFloat();

        System.out.print("Enter operator: ");
        String op = in.next();

        if(op=="+"){
            System.out.println("The operation done is addition");
            System.out.println(num1+num2);
        }
        if(op=="-"){
            System.out.println("The operation done is subs");
            System.out.println(num1-num2);
        }
        if(op=="*"){
            System.out.println("The operation done is multiplication");
            System.out.println(num1*num2);
        }
        if(op=="/"){
            System.out.println("The operation done is div");
            System.out.println(num1/num2);
        }




    }
}
