package com.javacourse;
//This placement season Company decided to have special uniform for all the students registered for the placements, but as the students were not happy with this decision they decided to irritate/confuse the placement staff by providing a large number rather than giving the accurate measurements of their uniform.
//
//        But Company knows how to handle such students.As a punishment they decided to put a penalty on such students. The amount of penalty which the student have to pay will be equal to sum of atmost 10 largest prime numbers that can be formed out of that number(number provide by the student).
//
//        Note:
//
//        1. It's Subarray ,not subsequence i.e:from "Input :123" 23 can be formed, not 13.
//
//        2. Duplicate prime numbers will not be added in the total.**
//
//        Input Format
//
//        A string containing the number entered by the student
//
//        Constraints
//
//        1<= entered_number <=10^10
//
//        Output Format
//
//        Sum of the 10 largest prime numbers(an integer) that can be formed out of that number.
//
//        Sample Input 0
//
//        12234
//
//        Sample Output 0
//
//        1474
//
//        Explanation 0
//
//        2+3+23+223+1223 = 1474

import java.util.Scanner;

public class addPrimenums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(sumPrime(n));
    }

    static int sumPrime(int n){
        int sum=0;
        int c=2;
        while(n>0){
            int rem = n%10;
            n = n/10;

            if(0 == 0 && n % c != 0 && n != 1){
                sum = n;
                if((rem % 1 == 0) && (rem%c != 0)){
                        sum = sum+rem;
                }
            }
            else{
                if(rem==2){
                    sum = sum+rem;
                }
                if((rem % 1 == 0) && (rem%c != 0)){
                        sum = sum+rem;
                }
            }


        }


        return sum;

    }


}
