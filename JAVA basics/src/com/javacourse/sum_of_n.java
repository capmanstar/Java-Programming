package com.javacourse;

import java.util.Scanner;

public class sum_of_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(sum(num));
    }

    static int sum(int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum = sum + i;
        }

        return sum;
    }
}
