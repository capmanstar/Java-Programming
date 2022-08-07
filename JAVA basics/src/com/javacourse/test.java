package com.javacourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    public static void main(String[] args) {

        int[][] image = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers (image));

    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        int[] minlist = new int[matrix.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<matrix.length; i++){
            int min = matrix[i][0];
            for(int j = 1; j<matrix[i].length; j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
            minlist[i] = min;
        }

        int[] maxlist = new int[matrix.length];
        for(int i = 0; i<matrix.length; i++){
            int max = matrix[0][i];
            for(int j = 1; j<matrix.length; j++){
                if(matrix[j][i]>max){
                    max = matrix[j][i];

                }
            }
            maxlist[i] = max;
        }

        for(int i=0; i<minlist.length; i++){
            for(int j=0; j<maxlist.length; j++){
                if(minlist[i]==maxlist[j]){
                    list.add(minlist[i]);
                    break;
                }
            }
        }


        return list;
    }
}
