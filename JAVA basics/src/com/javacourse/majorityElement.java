package com.javacourse;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int out = majorityEle(nums);
        System.out.println(out);
    }

    static int majorityEle(int[] nums) {
        selectSort(nums);
        int majority = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                majority = nums[i];
            }
        }

        return majority;
    }

    static void selectSort(int[] arr){

        for(int i=0; i<arr.length; i++){
            int first = i;
            int min = getMin(arr, first, arr.length-1);
            swap(arr, min, first);
        }



    }

    static int getMin(int[] arr, int start, int end){
        int min = start;
        for(int i = start; i<=end; i++){
            if(arr[i]<=arr[min]){
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
