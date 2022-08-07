package com.javacourse;

import java.util.Arrays;

public class change_number {
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int [] nums){
        nums[0] = 99;   //here we can change the value in array unlike primitives.

    }
}
