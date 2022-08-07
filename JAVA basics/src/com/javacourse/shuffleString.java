package com.javacourse;

public class shuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        String ans = restoreString(s,arr);
        System.out.println(ans);
    }

    static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<indices.length; i++){
            sb.append(s.charAt(indices[i]));
        }

        return sb.toString();
    }
}
