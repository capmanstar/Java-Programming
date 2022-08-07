package com.javacourse;

import java.util.Scanner;

public class electricity_bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the prev month unit consumption: ");
        double prev = in.nextDouble();
        System.out.print("Enter the current month unit consumption: ");
        double curr = in.nextDouble();

        double diff = curr-prev;
        double amt = 0;
        System.out.print("The total consumption is: "+diff);
        System.out.println();
        if(diff<=100){
            amt = 4.22*100;
            System.out.print("Your bill is: "+amt);
        }
        else if(diff>100 && diff<=200){
            amt = 4.22*100 + 5.02*100;
            System.out.print("Your bill is: "+amt);
        }
        else if(diff>200 && diff<=300){
            amt = 4.22*100 + 5.02*100 + 5.87*100;
            System.out.print("Your bill is: "+amt);
        }
        else {
            System.out.println("Unable to calculate!!!");
        }

    }
}
