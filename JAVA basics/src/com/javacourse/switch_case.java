package com.javacourse;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //String fruit = in.next();

        /*This is new syntax of the switch in java called as enhanced switch.
        switch(fruit){
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A red fruit");
            case "Orange" -> System.out.println("A round fruit");
            default -> System.out.println("Enter a valid fruit");
        }

         */

        /*old switch syntax.
        switch (fruit){
            case "Apple":
                System.out.println("A red fruit");
                break;
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Orange":
                System.out.println("A round fruit");
                break;
            default:
                System.out.println(Error);
        }

         */

        //Check weekday and weekend code.
        int day = in.nextInt();
        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }



//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }



    }
}
