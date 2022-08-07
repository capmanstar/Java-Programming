package com.javacourse;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {

        //Q: Check either upper case or lower case

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);  //to get single letter as input

        if(ch>='a' && ch<='z'){
            System.out.println("Lower case");
        }
        else{
            System.out.println("Upper case");
        }

    }
}
