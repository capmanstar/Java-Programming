package com.javacourse;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        //dynamic array means no need to pass the size of the list
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);

//        System.out.println(list);

        //input in arraylist
        for(int i = 0;i<5;i++){
            list.add(in.nextInt());
        }

//        for(int i = 0;i<5;i++){
//            System.out.println(list.get(i));
//        }

        //output in arraylist
        System.out.println(list);
    }
}
