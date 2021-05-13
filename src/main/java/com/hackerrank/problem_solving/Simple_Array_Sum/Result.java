package com.hackerrank.problem_solving.Simple_Array_Sum;

import java.util.List;

class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int result = 0;
        for(Integer integer:ar){
            result += integer;
        }
        return result;
    }

}

