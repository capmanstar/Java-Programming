package com.javacourse;

import java.util.Scanner;

public class even_odd {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();

        if(num%2==0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
    }
}
