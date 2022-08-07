package com.javacourse;

import java.util.Scanner;

public class temprature {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter celcius value: ");
        float tempc = sc.nextFloat();

        float tempf = (tempc * 9/5) + 32;
        System.out.println(tempf);
    }
}
