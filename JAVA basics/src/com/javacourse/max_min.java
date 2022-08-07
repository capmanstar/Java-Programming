package com.javacourse;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int out = min_max(x,y,z);
        System.out.println(out);
    }

    static int min_max(int a, int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }
        else if(c>max){
            max = c;
        }
        return max;
    }
}
