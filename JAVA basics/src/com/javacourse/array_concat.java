package com.javacourse;

import java.util.Arrays;

public class array_concat {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] answer = getConcatenation(nums);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length*2];
        int i = 0;
        int resultindex = 0;

        while(i<nums.length){
            ans[resultindex] = nums[i];
            i++;
            resultindex++;
        }
        i = 0;
        while(i<nums.length){
            ans[resultindex] = nums[i];
            i++;
            resultindex++;
        }

        return ans;

    }

}
