package com.javacourse;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class maxModulo {
    public static void main(String[] args) {
        int[] arr = {10, 7, 18};
        System.out.println(modulo(arr,arr.length,13));

    }

    static Integer modulo(int[] arr, int n, int m){
        Set<Integer> sum = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            int mod = arr[i]%m;
            sum.add(mod);
        }
        int prefix = 0;
        for(int i=0; i<n; i++){
            prefix = (prefix + arr[i])%m;
            sum.add(prefix);
        }
        System.out.println(sum);
        return Collections.max(sum);

    }
}
