package com.javacourse;

import java.util.Scanner;

public class fibonnaci_series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int firstterm = 0;
        int secondterm = 1;


        for(int i=0; i<num; ++i){
            System.out.println(firstterm+", ");
            int nextterm = firstterm+secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
        }


        /*
        int i = 1;
        while(i<=num){
            System.out.println(firstterm+", ");
            int nextterm = firstterm+secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
            i++;
        }
        */

    }
}
