package com.javacourse;

import java.util.Arrays;
import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        //Array input
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
