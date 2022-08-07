package com.javacourse;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(sort(arr));
    }

    static List<Integer> sort(int[] nums){
        List<Integer> duplicates = new ArrayList<Integer>();
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
                duplicates.add(nums[index]);
            }
        }
        System.out.println(Arrays.toString(nums));
        return duplicates;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
