package com.javacourse;

import java.util.Scanner;

public class armstrong_num_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean out = isArmstrong(n);
        System.out.println(out);
    }

    static boolean isArmstrong(int n){
        int original = n;
        double remainder = 0;
        double result = 0;

        while(original!=0){
            remainder = original%10;
            result = result + Math.pow(remainder,3);
            original = original/10;
        }
        return result==n;
    }
}
