package com.hackerrank.problem_solving.easy.Plus_Minus;

import java.util.List;

public class Result {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double positiveCount = 0, negativeCount =0, zeroCount =0;
        for(Integer integer:arr){
            if(integer>0){
                positiveCount++;
            }else if(integer<0){
                negativeCount++;
            }else {
                zeroCount++;
            }
        }
        System.out.printf("%.6f%n",(positiveCount/arr.size()));
        System.out.printf("%.6f%n",(negativeCount/arr.size()));
        System.out.printf("%.6f%n",(zeroCount/arr.size()));
    }
}
