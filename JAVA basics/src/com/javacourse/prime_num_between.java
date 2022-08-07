package com.javacourse;

import java.util.Arrays;
import java.util.Scanner;

public class prime_num_between {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a");
        int a = in.nextInt();
        System.out.println("Enter b");
        int b = in.nextInt();
        prime_nums(a,b);
    }

    static void prime_nums(int a, int b){
       int[] primes = new int[20];
       for(int i= a+1; i>a && i<b; i++){
           int c=a;
           while(c<b){

               if(i%1==0 && i%i==0){
                   if(i%c!=0){
                       for(int j:primes){
                           primes[j] = i;
                       }
                   }

               }
               else{
                   c++;
               }
           }

       }

        System.out.println(Arrays.toString(primes));

    }
}
