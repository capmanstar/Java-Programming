package com.javacourse;

import java.util.Scanner;

public class fibonacci_series {

    //Find nth fibonnaci number.

    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 2;

        while(count<=num){
            int temp = b;
            b = b+a;
            a = temp;
            count++;

        }


        System.out.println(b);
    }
}
