package com.javacourse;

import java.util.Arrays;
import java.util.Scanner;

        public class array_2d_input {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int[][] arr = new int[3][3];

        //length of an arr = no. of rows.
        //arr[row].length = no. of cols
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
