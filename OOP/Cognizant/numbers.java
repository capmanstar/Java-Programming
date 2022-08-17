package Cognizant;

import java.util.*;
public class numbers {

    public static void main(String[] args) {

        System.out.println(machines(3,6));

    }

    static int machines(int m, int x){


        List<Integer> list = new ArrayList<>();
        int i = 1;
        while(i<=x){
            list.add(i);
            i = i+2;
            if(i==x){
                list.add(x);
                break;
            }
            else if(i>x){
                list.add(x);
                break;
            }
        }

        return fact(list.size());
    }

    static int fact(int n){
        if(n<2){
            return n;
        }

        return n*fact(n-1);
    }

}
