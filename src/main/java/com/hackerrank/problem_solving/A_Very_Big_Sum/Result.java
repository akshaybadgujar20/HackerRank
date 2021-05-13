package com.hackerrank.problem_solving.A_Very_Big_Sum;

import java.util.List;

public class Result {
    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long result=0;
        for(Long aLong:ar){
            result += aLong;
        }
        return result;
    }
}
