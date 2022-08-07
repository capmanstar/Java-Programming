package com.javacourse;

public class multiD_array {
    public static void main(String[] args) {
        int[][] arr = new int[3][]; //No. of rows are must to be given but no. of cols is not mandetory because each row can have diffn cols.

        int[][] arr2 = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        //print the 2d array
        for(int row=0;row<arr2.length;row++){
                    for(int col=0;col<arr2[row].length; col++){
                        System.out.println(arr2[row][col] + " ");
            }
        }
    }
}
