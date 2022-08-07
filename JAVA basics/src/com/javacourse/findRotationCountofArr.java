package com.javacourse;

public class findRotationCountofArr {
    public static void main(String[] args) {
        int[] arr = {2,4,2,2,2};
        int ans = pivot(arr)+1;
        System.out.println(ans);
    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1] && mid<end){
                return mid;
            }
            else if(arr[mid]<arr[mid-1] && mid>start){
                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }




        }
        return -1;
    }
}
