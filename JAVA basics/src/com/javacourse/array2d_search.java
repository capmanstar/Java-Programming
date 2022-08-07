package com.javacourse;

import java.util.Arrays;

public class array2d_search {
    public static void main(String[] args) {
        int[][] nums = {
                {12,48,65},
                {40,15,22,63,89},
                {1,2,7,8}
        };
        int[] result = multiDArrSearch(nums,8);
        System.out.println(Arrays.toString(result));
    }

    static int[] multiDArrSearch(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
