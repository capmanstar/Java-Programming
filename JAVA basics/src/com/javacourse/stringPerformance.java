package com.javacourse;

public class stringPerformance {
    public static void main(String[] args) {
//        String series = "";
//        for(int i=0; i<26; i++){
//            char ch = (char) ('a' + i);
//            //System.out.println(ch);
//            series = series + ch;
//        }
//        System.out.println(series);

        //above method creates new obj each time when new char is added to series hence reduces the string performance
        //To solve this we use StringBuilder class

        StringBuilder builder = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char) ('a' + i);
            builder.append(ch);
        }

        System.out.println(builder);
    }
}
