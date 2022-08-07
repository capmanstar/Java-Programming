package com.javacourse;
import java.util.Scanner;

public class even_odd_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
       even_odd(num);
    }

    static void even_odd(int n){

        if(n%2==0){
            System.out.println("Even");
        }
        else if(n%2!=0){
            System.out.println("Odd");
        }
    }
}
