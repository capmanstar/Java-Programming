package com.javacourse;

import java.util.Arrays;

public class two_sum_arr {
    public static void main(String[] args){
        int[] nums = {3,2,3};
        int target = 6;
        int[] out = twoSum(nums,target);
        System.out.println(Arrays.toString(out));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];
        int x = nums[1];
        for(int i=0; i<nums.length; i++){
            if(target-x == nums[i]){
                ans[1] = i;
                ans[0] = 1;
                break;
            }

        }

        return ans;
    }
}
