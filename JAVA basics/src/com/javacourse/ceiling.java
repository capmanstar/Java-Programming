package com.javacourse;

public class ceiling {
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int ans = ceiling(arr,15);
        System.out.println("The ceiling number is at position "+ans);
    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while(start<=end){

            int mid = start + (end-start)/2;
            int min = 0;

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;

                }
                else{
                    start = mid+1;

                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;

                }
                else{
                    start = mid+1;

                }
            }


        }

        return start;
    }
}
