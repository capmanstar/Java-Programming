package com.javacourse;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i = 0;
        while(i <= arr.length+1){
            //int correct = arr[i];

            if(arr[i]!=i){
                swap(arr,i,arr[i]);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
