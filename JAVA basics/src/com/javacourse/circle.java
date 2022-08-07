package com.javacourse;

import java.sql.SQLOutput;
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double r = in.nextDouble();
        area_circum(r);
    }

    static void area_circum(double r){
        double area = Math.PI *r*r;
        double circum = Math.PI *2*r;
        System.out.println("Area is: "+area);
        System.out.println("Circumference is: "+circum);
    }
}
