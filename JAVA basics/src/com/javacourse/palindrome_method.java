package com.javacourse;

import java.util.Scanner;

public class palindrome_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        palindrome(n);
    }
     static void palindrome(int num){
        int reverse = 0;
        int original = num;
        while (original!=0){
            int remainder = original%10;
            reverse = reverse*10 + remainder;
            original = original/10;
        }

        if(num==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
     }
}
