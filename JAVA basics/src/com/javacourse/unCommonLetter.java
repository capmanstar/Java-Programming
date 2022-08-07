package com.javacourse;

//Ivaan is a naughty boy. His father brought him a letter game. And made a word out of it and asked ivaan to read all the letters one by one. But as soon as his father got distracted, ivaan shuffled the letters and added one more letter into it. Now he asked his father to find out the newly added letter. If his father succeeded in that, then only ivaan will repeat the letters.
//
//        You will be given both the strings initial and final. And you have to find out that newly added letter to help his father.
//
//        Note
//
//        The initial string can also be given as empty, represented by "-" (hyphen).
//
//        Constraints
//
//        1 <= initial_string.length <= 1000
//
//        final_string.length == initial_string.length + 1
//
//        Input format
//
//        First-line contains the string in the beginning - inital_string.
//
//        Second-line contains the string after ivaan modification - final_string.
//
//        Output format
//
//        Print the newly added letter after ivaan modification.


import java.util.HashSet;
import java.util.Set;

public class unCommonLetter {
    public static void main(String[] args) {

        Set<Character> ans = commonChild("WXYZ","ZYX");
        System.out.println(ans);
    }

    static Set<Character> commonChild(String str1, String str2){

        Set<Character> common_let = new HashSet<Character>();
        Set<Character> un_common = new HashSet<Character>();
        Set<Character> final_list = new HashSet<Character>();
        int count = 0;
        for(char ch: str1.toCharArray()){
            for(char ch1: str2.toCharArray()){
                if(ch1 == ch){
                    common_let.add(ch1);
                }
                else if(ch1 != ch){
                    un_common.add(ch);
                }
            }
        }

        for(char ch:un_common){
            if(!common_let.contains(ch)){
                final_list.add(ch);
            }
        }

        //System.out.println(final_list);
        //System.out.println(common_let);
        //System.out.println(un_common);
        return final_list;


    }
}
