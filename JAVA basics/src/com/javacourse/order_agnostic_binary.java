package com.javacourse;
//Order agnostic means we know that the array is sorted but we dont know either asc or desc.
public class order_agnostic_binary {
    public static void main(String[] args) {

        //int[] arr = {-12,-48,0,2,8,10,15,18,26,29,35,86};
        int[] arr = {99,90,85,78,65,59,46,20,10,5,-3,-4};
        int ans = orderAgnosticBS(arr,78);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while(start<=end){

            int mid = start + (end-start)/2;

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
        return -1;
    }
}
