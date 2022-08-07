package com.javacourse;
import java.util.*;

public class multiArrlist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //2d arrlist creation
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }

        //2d arrlist input
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);


    }
}
