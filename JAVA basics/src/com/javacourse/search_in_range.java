package com.javacourse;

public class search_in_range {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(rangeSearch(nums,1,5,5));
    }

    static int rangeSearch(int[] arr, int start, int end, int target){
        for(int i=start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
