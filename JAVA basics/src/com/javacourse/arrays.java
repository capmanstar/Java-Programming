package com.javacourse;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] arr = new int[5]; //Array declaration
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        //to print elements in an array;
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));

        //Another declaration type.
        String[] str = {"Darshan","Rushi","Shailesh","Anupam","Harsh"};
        System.out.println(Arrays.toString(str));


        char[] arr1 = new char[5];
        System.out.println(Arrays.toString(arr1)); //this gives 0 as output as int is an primitive data type.

        String[] str1 = new String[5];
        System.out.println(Arrays.toString(str1)); //it gives output as null as str is non primitive it calls for literal null.



    }
}
