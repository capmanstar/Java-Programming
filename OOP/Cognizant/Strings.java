package Cognizant;

public class Strings {

    public static void main(String[] args) {
        System.out.println(subseq("dbacbz"));
    }


    static int subseq(String str){

        String str1 = "";
        for (int i = 1; i <= str.length(); i++) {
            if(i<str.length() && str.charAt(i)>str.charAt(i-1)){
                str1 = str1 + str.charAt(i-1);
            }
            else if(i==str.length()){
                str1 = str1 + str.charAt(i-1);
            }
        }

        return str1.length();

    }

}
