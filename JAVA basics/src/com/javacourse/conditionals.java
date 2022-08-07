package com.javacourse;

public class conditionals {
    public static void main(String[] args) {

        int salary = 26_000;

        if(salary>10000){
            salary += 2000;
        }
        else if(salary<10000){   //Multiple if statement
            salary += 1000;
        }
        else{
            salary += 500;
        }

        System.out.println(salary);
    }
}
