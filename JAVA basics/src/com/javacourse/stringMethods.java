package com.javacourse;

public class stringMethods {
    public static void main(String[] args) {

        String name = "Darshan Sonawane";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(3));
        System.out.println(name.contains("o"));
        System.out.println(name.trim());
        System.out.println("  Darshan  ".strip());
        System.out.println(name.indexOf("a"));
    }
}
