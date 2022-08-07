package com.javacourse;
import java.util.Scanner;

public class last_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        double pow = Math.pow(N,K);

        double remn = pow%10;
        System.out.println(remn);


    }
}
