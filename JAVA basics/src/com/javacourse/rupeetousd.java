package com.javacourse;

import java.util.Scanner;

public class rupeetousd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in Rupees: ");
        float rs = sc.nextFloat();

        float usd = rs / 0.013f;

        System.out.println("The USD is, " + usd);
    }
}
