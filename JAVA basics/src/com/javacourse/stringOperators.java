package com.javacourse;

import java.util.ArrayList;

public class stringOperators {
    public static void main(String[] args) {
        System.out.println((char) ('a'+3));
        System.out.println("darshan" + 1207);
        System.out.println("darshan" + new ArrayList<Integer>());
        String str = new Integer(1207) + "" + new ArrayList<Integer>();
        System.out.println(str);
        System.out.println("Darshan "+"Sonawane");
    }
}
