package com.javacourse;
//You and your friend have the plan to go to a movie but your friend is busy with his coding work.
//
//        You eagerly want to go to a movie so you decided to help him.
//
//        For this,
//
//        You have given an array of n length and also given that array has distinct numbers. You can interchange any two elements of the array any number of times.
//
//        An array is perfect if the sum of array[i] – array[i-1] is minimal.
public class swapCount {

    public static void main(String[] args) {
        int[] arr = {4,6,8,9};
        int ans = selectSort(arr);
        System.out.println(ans);
    }


    static int selectSort(int[] arr){
        //This method finds the minimum element and then sorts the arr from left.
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int first = i;
            int min = getMin(arr, first, arr.length-1);
            swap(arr, min, first);
            count++;
        }

        //This method finds the maximum element and then sorts the arr from right.
//        for(int i=0; i<arr.length; i++){
//            int last = arr.length-i-1;
//            int max = getMax(arr, 0, last);
//            swap(arr, max, last);
//        }

        return count;

    }

    static int getMin(int[] arr, int start, int end){
        int min = start;
        for(int i = start; i<=end; i++){
            if(arr[i]<arr[min]){
                min = i;
            }
        }
        return min;
    }

//    static int getMax(int[] arr, int start, int end){
//        int max = start;
//        for(int i = start; i<=end; i++){
//            if(arr[i]>arr[max]){
//                max = i;
//            }
//        }
//        return max;
//    }

    static void swap(int[] arr, int first, int second){
        if(arr[first]<arr[second]){
            arr[first] = arr[first];
            arr[second] = arr[second];
        }
        else{
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;

        }
    }

}
