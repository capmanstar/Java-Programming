package com.javacourse;

import java.util.Scanner;

public class pythagorean_triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        System.out.print("Enter c: ");
        int c = in.nextInt();

        System.out.println(pytyhag(a,b,c));

    }

    static boolean pytyhag(int a, int b, int c){
        boolean flag = false;
        int rhs = c*c;
        int lhs = a*a + b*b;
        if(rhs==lhs){
            flag = true;
        }
        else{
            flag = false;
        }

        return flag;
    }
}
