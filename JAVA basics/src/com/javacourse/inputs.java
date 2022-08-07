package com.javacourse;
import java.util.Scanner;

public class inputs {
    public static void main(String [] args){

        //int input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        //int num = input.nextInt();
        float num = input.nextFloat();
        System.out.println("The number is, " + num);
    }
}
