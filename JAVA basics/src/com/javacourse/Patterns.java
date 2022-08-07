package com.javacourse;

public class Patterns {
    public static void main(String[] args) {
        //pattern2(5);
        //pattern1(5);
        pattern3(5);
        //pattern5(5);
        //pattern6(5);
        //pattern7(5);
        //pattern8(5);
    }


//            *
//            **
//            ***
//            ****
//            *****
    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//            *****
//            *****
//            *****
//            *****
//            *****
    static void pattern1(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//            *****
//            ****
//            ***
//            **
//            *
    static void pattern3(int n){
        for(int row=0; row<n; row++){
            for(int col=1; col<=n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//            1
//            12
//            123
//            1234
//            12345

    static void pattern4(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
    static void pattern5(int n){
        for(int row=1; row<2*n; row++){

            if(row <= n){
                for(int col=1; col<=row; col++){
                    System.out.print("* ");
                }
            }
            else if(row>n){
                for(int col=1; col<=2*n-row; col++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int row=0; row<2*n; row++){
            int totalColsInRow = row>n ? 2*n-row: row;
            int totalNoOfSpaces = n - totalColsInRow;

            for(int s=0; s<totalNoOfSpaces; s++){
                System.out.print(" ");
            }
            for(int col=0; col<totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//              1
//            2 1 2
//          3 2 1 2 3
//        4 3 2 1 2 3 4
//      5 4 3 2 1 2 3 4 5
    static void pattern7(int n){
        for(int row=1; row<=n; row++){
            for(int s=0; s<n-row; s++){
                System.out.print(" ");
            }

            for(int col=row; col>=1; col--){
                System.out.print(col);
            }
            for(int col=2; col<=row; col++){
                System.out.print(col);
            }

            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int row=1; row<2*n; row++){
            int totalColsInRow = row>n ? 2*n-row: row;
            int totalNoOfSpaces = n - totalColsInRow;

            for(int s=0; s<totalNoOfSpaces; s++){
                System.out.print(" ");
            }

            for(int col=totalColsInRow; col>=1; col--){
                System.out.print(col);
            }
            for(int col=2; col<=totalColsInRow; col++){
                System.out.print(col);
            }

            System.out.println();
        }
    }
}
