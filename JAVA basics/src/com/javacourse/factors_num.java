package com.javacourse;

import java.util.Scanner;

public class factors_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int i = 1;
        int count = 0;
        while(i<=num){
            if (num%i==0){
                System.out.println(i);
                count++;
            }

            i++;
        }
        System.out.println("Total factors of "+num+" are "+count);

    }
}
