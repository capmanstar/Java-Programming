package com.javacourse;

import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        String dept = in.next();

        switch(id){
            case 1 -> System.out.println("Darshan Sonawane");
            case 2 -> System.out.println("Rushikesh Vetal");
            case 3 -> {
                System.out.println("This case 3");
                switch(dept){
                    case "IT" -> System.out.println("IT department");
                    case "Managment" -> System.out.println("Managment dept");
                    default -> System.out.println("Error");
                }

            }
            default -> System.out.println("Error");
        }
    }
}
