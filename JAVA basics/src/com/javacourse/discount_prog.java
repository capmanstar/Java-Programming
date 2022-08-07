package com.javacourse;


import java.util.Scanner;

public class discount_prog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the original amount of product: ");
        double prod = in.nextDouble();
        System.out.print("Enter the discount offered: ");
        double percn = in.nextDouble();

        double discount = 0;
        if (percn == 0) {
            System.out.println("Wrong value entered at discount!!!");
        } else if (percn != 0) {
            double decimal = percn / 100;
            double mult = prod * decimal;
            discount = prod - mult;
        }

        System.out.println("The discounted price is: " + discount);
    }
}
