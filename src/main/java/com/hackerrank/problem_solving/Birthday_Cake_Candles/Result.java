package com.hackerrank.problem_solving.Birthday_Cake_Candles;

import java.util.List;

public class Result {
    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int result =0;
        int max = 0;
        int maxCount = 0;
        for(Integer integer:candles){
            if(integer>max){
                maxCount = 0;
                max = integer;
                maxCount++;
            }else if(integer==max){
                maxCount++;
            }
        }
        result = maxCount;
        return result;
    }
}
