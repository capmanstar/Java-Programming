package com.javacourse;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter priciple: ");
        float p = in.nextFloat();
        System.out.println("Enter time: ");
        float t = in.nextFloat();
        System.out.println("Enter rate: ");
        float r = in.nextFloat();

        float si = (p*t*r)/100;

        System.out.println("The interest is, " + si);
    }
}
