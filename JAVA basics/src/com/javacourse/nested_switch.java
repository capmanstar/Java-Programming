package com.javacourse;

import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String dept = sc.next();

        switch(id){
            case 1 -> System.out.println("ABC");
            case 2 -> System.out.println("XYZ");
            case 3 -> {System.out.println("Employee id");
                switch (dept){
                    case "DevOps" -> System.out.println("Coding");
                    case "Management" -> System.out.println("Project manager");
                    default -> System.out.println("No match found");
                }
            }
            default -> System.out.println("No match found");

        }
    }
}
