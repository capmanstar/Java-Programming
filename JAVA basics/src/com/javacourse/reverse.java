package com.javacourse;

public class reverse {
    public static void main(String[] args) {
        int num = 2547893;

        int rev = 0;

        while(num>0){
            int rem = num%10;
            num = num/10;
            rev = rev*10 + rem;
        }

        if(num==rev){
            System.out.println("Palindrome");
        }
        System.out.println(rev);
    }
}
