package com.javacourse;

public class binary_search {
    public static void main(String[] args){
        int[] nums = {-12,-48,0,2,8,10,15,18,26,29,35,86};
        int ans = binarySearch(nums, -12);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
