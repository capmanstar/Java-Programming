package com.javacourse;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){
        int[] arr = {-1,-45,56,2,1,3,0};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swaped = false;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }
}
