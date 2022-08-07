package com.javacourse;

public class prod_sum {


    public static void main(String[] args) {
        int prod = 1;
        int sum = 0;
        int n = 234;
        while (n>=1){
            int remainder = n%10;
            prod = prod*remainder;
            sum = sum+remainder;
            n = n/10;
        }

        System.out.println(prod-sum);
    }


}
