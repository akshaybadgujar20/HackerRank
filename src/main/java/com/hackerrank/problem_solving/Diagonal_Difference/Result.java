package com.hackerrank.problem_solving.Diagonal_Difference;

import java.util.List;

public class Result {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int result = 0;
        int left = 0;
        int right = arr.size()-1;
        int leftSum = 0, rightSum =0;
        for(int index=0;index<arr.size();index++){
            leftSum += arr.get(index).get(left);
            rightSum += arr.get(index).get(right);
            left++;
            right--;
        }
        result = Math.abs(leftSum-rightSum);
        return result;
    }
}
