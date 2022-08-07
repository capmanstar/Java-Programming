package com.javacourse;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int m = in.nextInt();
        marks(m);
    }

    static void marks(int m){
        if(m>=91 && m<=100){
            System.out.println("AA");
        }
        else if(m>=91 && m<=90){
            System.out.println("AB");
        }
        else if(m>=81 && m<=90){
            System.out.println("AB");
        }else if(m>=71 && m<=80){
            System.out.println("BB");
        }
        else if(m>=61 && m<=70){
            System.out.println("BC");
        }
        else if(m>=51 && m<=60){
            System.out.println("CD");
        }
        else if(m>=41 && m<=50){
            System.out.println("DD");
        }
        else if(m<=40){
            System.out.println("FAIL");
        }
    }
}
