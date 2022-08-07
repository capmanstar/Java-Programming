package com.javacourse;

public class string_search {
    public static void main(String[] args) {
        String name = "Darshan";
        boolean ans = strSearch(name,'n');
        System.out.println(ans);
    }

    static boolean strSearch(String str, char l){
        if(str.length()==0){
            return false;
        }

//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == l){
//                return true;
//            }
//        }

        for(char ch:str.toCharArray()){
            if(ch == l){
                return true;
            }
        }
        return false;
    }
}
