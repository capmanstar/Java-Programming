package com.javacourse;
import java.util.Scanner;
public class sum {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int sum = n1+n2;

        System.out.println("Sum is: " + sum);
    }
}
