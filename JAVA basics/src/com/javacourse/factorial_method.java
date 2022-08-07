package com.javacourse;

import java.util.Scanner;

public class factorial_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.println(factorial(n));
    }

    static String factorial(int n){
        int fact = 1;
        for(int i = 1;i<=n; i++){
            fact = fact*i;
        }

        return "The factorial is, "+fact;
    }
}
