package com.javacourse;

import java.util.Scanner;

public class prime_num_method {
    static boolean p;
    static boolean np;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //isPrime(n);
        primeWithSQRT(n);

    }

    static void isPrime(int n){
        if(n<=1){
            System.out.println("Not prime");
        }


        for(int c = 2; c<=n; c++){
            if(n%1==0 && n%n==0){
                p = true;
                if(n%c==0){
                    np = true;
                    p = false;
                }
            }

        }

        if (p){
            System.out.println("Prime");
        }
        if (np){
            System.out.println("Not Prime");
        }

    }

    static void primeWithSQRT(int n){
        int c = 2;
        boolean p = false;
        boolean np = false;
        while(c*c <= n){
            if(n%c == 0){
                np = true;
                break;
            }
            else{
                c++;
                p = true;
            }

        }
        if(p){
            System.out.println("prime");
        }
        if(np){
            System.out.println("not prime");
        }
    }
}
