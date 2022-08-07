package com.javacourse;

import java.util.Scanner;

public class greater_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Number 2: ");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("Greater number is, " + num1);
        }
        else{
            System.out.println("Greater number is, " + num2);
        }

    }
}
