package com.javacourse;

public class max_in_arr {
    public static void main(String[] args) {
        int[] arr = {1,3,5,0,99,9,102};
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The max in given array is: "+max);
    }
}
