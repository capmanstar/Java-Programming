package com.javacourse;

public class countOfRotation {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        //(index of pivot)+1 is same as count of rotation of an array.
        int ans = findPivot(arr) + 1;
        System.out.println(ans);
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }
}
