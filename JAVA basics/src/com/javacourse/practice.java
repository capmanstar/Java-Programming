package com.javacourse;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));


    }
    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i==0){
                ans[i] = nums[i];
            }
            else if(i!=0){
                ans[i] = ans[i]+ans[i-1];
            }


        }

        return ans;
    }
}
