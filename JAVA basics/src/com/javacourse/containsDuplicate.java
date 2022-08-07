package com.javacourse;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,3};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }

    static boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        selectSort(nums);
        if(nums.length == 1){
            return false;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                flag = true;
            }
        }

        return flag;
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
