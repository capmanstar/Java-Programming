package com.javacourse;

public class stringComparison {
    public static void main(String[] args) {

        String a = "darshan";
        String b = "darshan";

        // both a and b are pointing to a same obj called darshan in the string pool.
        System.out.println(a==b);

        String c = new String("darshan");
        String d = new String("darshan");

        //as we created to new objects with same name but pointing to different objs hence we get false
        System.out.println(c==d);

        //it only compares the values
        System.out.println(c.equals(d));
    }
}
