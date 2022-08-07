package com.javacourse;

import java.util.Scanner;

public class vote_eligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age to check eligibility for voting: ");
        int age = in.nextInt();
        vote(age);
    }

    static void vote(int a){

        if(a>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
