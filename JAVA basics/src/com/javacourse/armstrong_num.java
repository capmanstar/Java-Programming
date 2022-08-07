package com.javacourse;

import java.util.Scanner;

public class armstrong_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int arm = in.nextInt();
        int originalnum = arm;
        double result = 0;
        double remainder = 0;

        while(originalnum!=0){
            remainder = originalnum%10;
            result = result + Math.pow(remainder,3);
            originalnum = originalnum/10;
        }

        if(result==arm){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not armstrong");
        }

    }
}
