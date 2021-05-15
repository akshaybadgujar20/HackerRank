package com.hackerrank.problem_solving.easy.Jumping_on_the_Clouds;

import java.util.List;

public class Result {
    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int result = 0;
        int index=0;
        while (index<c.size()-1){
            if(index+2 < c.size() && c.get(index+2).equals(0)){
                result++;
                index += 2;
            }else if(index+1 < c.size() && c.get(index+1).equals(0)){
                result++;
                index++;
            }
        }
        return result;
    }
}
