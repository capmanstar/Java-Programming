package com.javacourse;

public class countZeros {
    public static void main(String[] args) {
        int ans = helper(30204);
        System.out.println(ans);
    }

    //Special pattern, how to pass values to above calls.
    static int helper(int n){
        return count(n,0);
    }
    static int count(int n, int cnt){
        if(n==0){
            return cnt;
        }
        int rem = n%10;
        if(rem == 0){
            return count(n/10,cnt+1);
        }
        return count(n/10,cnt);

    }
}
