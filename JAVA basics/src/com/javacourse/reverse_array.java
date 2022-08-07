package com.javacourse;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {1,3,8,9,10,12,45,78};
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
    }
}
