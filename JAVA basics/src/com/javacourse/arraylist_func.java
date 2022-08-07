package com.javacourse;

import java.util.ArrayList;

public class arraylist_func {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        list.set(0,99); //change the val
        System.out.println(list);
        list.remove(4); //remove the val
        System.out.println(list);

    }
}
