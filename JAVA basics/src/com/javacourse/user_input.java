package com.javacourse;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter number: ");
            int num = in.nextInt();
            sum = sum + num;
            if(num==0){
                break;
            }
        }
        System.out.println("The sum is: "+sum);
    }
}
