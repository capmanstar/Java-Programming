package com.javacourse;

import java.util.ArrayList;
import java.util.List;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(sort(arr));
    }

    static List<Integer> sort(int[] nums){
        List<Integer> missing = new ArrayList<Integer>();
        int i =0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else if(nums[i]==nums[correct]){
                nums[i] = correct;
            }
            else{
                i++;
            }
        }

        for(int index=0; index<nums.length; index++){
            if(index>0 && nums[index] == nums[index-1]){
                missing.add(index+1);
            }
        }

        return missing;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
