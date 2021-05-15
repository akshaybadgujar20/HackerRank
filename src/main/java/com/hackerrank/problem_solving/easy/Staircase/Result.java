package com.hackerrank.problem_solving.easy.Staircase;

public class Result {
    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        int index=n-1;
        for(int i=0;i<n;i++){
            for(int k=index;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("#");
            }
            System.out.println("");
            index--;
        }
    }
}
