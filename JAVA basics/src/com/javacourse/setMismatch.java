package com.javacourse;

import java.util.ArrayList;
import java.util.List;

public class setMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(sort(nums));
    }

    static int[] sort(int[] nums){

        int i =0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        for(int index=0; index<nums.length; index++){
            if(nums[index] != index+1){
                return new int[] {nums[index],index+1};
            }
        }

        return new int[] {-1,-1};
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
