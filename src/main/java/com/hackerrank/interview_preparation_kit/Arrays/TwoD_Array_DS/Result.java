package com.hackerrank.interview_preparation_kit.Arrays.TwoD_Array_DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Result {
    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int result = 0;
        int sum = 0;
        List<Integer> integerList = new ArrayList<>();
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum = 0;
                sum += arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                sum += arr.get(i+1).get(j+1);
                sum += arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                System.out.println("sum => "+sum);
                integerList.add(sum);
            }
        }
        Collections.sort(integerList);
        return integerList.get(15);
    }
}
