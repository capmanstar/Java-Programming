package com.javacourse;

public class linear_search {
    public static void main(String[] args) {
        int[] nums = {12,23,54,-22,10,1,5,8,-15,0};
        int index = linearSearch(nums,100);
        System.out.println(index);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}
