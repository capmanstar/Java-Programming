package com.javacourse;

public class counting_occurrnce {
    public static void main(String[] args) {

        int num = 125675356;
        int count = 0;

        while(num>0){

            int remainder = num%10;
            if(remainder==6){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);


    }
}
