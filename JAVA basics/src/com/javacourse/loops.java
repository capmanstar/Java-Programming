package com.javacourse;

import java.util.Scanner;

public class loops {
    public static void main(String [] args){

        //for loop
        /*
        Syntax for for loop;

        for(initialize; condition; increment/decrement){
            code;
        }


        //print numbers from 1 to 5;

        for(int num=1; num<=5; num += 1){
            System.out.println(num);
        }

        //print numbers from 1 to n;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i+=1){
            System.out.println(i);
        }

         */

        /*
        while loop syntax

        initialize
        while(condition){
            code;
            increment/decrement;
        }


        int num=1;
        while(num<=5){
            System.out.println(num);
            num+=1;
        }

         */

        /*
        syntax for do-while loop;
        initialize;
        do{
            code;
        }while(condition);

        it executes at least once - this is the difference between while & dowhile loop.
         */

        int num=1;
        do{
            System.out.println("Hello world");
        }while(num!=1);


    }
}
