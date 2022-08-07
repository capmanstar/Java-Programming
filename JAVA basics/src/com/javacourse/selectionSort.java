package com.javacourse;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args){
        int[] arr = {3,6,1,4,2,5};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectSort(int[] arr){
        //This method finds the minimum element and then sorts the arr from left.
        for(int i=0; i<arr.length; i++){
            int first = i;
            int min = getMin(arr, first, arr.length-1);
            swap(arr, min, first);
        }

        //This method finds the maximum element and then sorts the arr from right.
//        for(int i=0; i<arr.length; i++){
//            int last = arr.length-i-1;
//            int max = getMax(arr, 0, last);
//            swap(arr, max, last);
//        }

    }

    static int getMin(int[] arr, int start, int end){
        int min = start;
        for(int i = start; i<=end; i++){
            if(arr[i]<arr[min]){
                min = i;
            }
        }
        return min;
    }

//    static int getMax(int[] arr, int start, int end){
//        int max = start;
//        for(int i = start; i<=end; i++){
//            if(arr[i]>arr[max]){
//                max = i;
//            }
//        }
//        return max;
//    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
