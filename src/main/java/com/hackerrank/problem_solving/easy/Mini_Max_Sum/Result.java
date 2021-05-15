package com.hackerrank.problem_solving.easy.Mini_Max_Sum;

import java.util.Collections;
import java.util.List;

public class Result {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long min =0, max =0;
        for(int index=0;index<arr.size();index++){
            if(index<arr.size()-1){
                min += arr.get(index);
            }
            if(index>0){
                max += arr.get(index);
            }
        }
        System.out.println(min+" "+max);
    }
}
