package com.javacourse;

import java.util.Scanner;

public class charity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int charity = 0;
        for(int i=1; i<=days; i++){
            charity = charity + i*i;
        }

        System.out.println(charity);
    }
}
