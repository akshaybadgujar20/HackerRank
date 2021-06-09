package com.hackerrank.problem_solving.medium.Greedy_Florist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Result {
    // Complete the getMinimumCost function below.

    /*
     *   3
     *   1 3 5 7 9 15 17 11 19 13
     * */

    static int getMinimumCost(int k, int[] c) {
        int result = 0;
        int iteration = 0;
        int round = k == 1 ? c.length : (c.length % k) == 0 ? (c.length/k) : (c.length/k) + 1;
        int counter = 0;
        c = Arrays.stream(c).sorted().toArray();
        if(round>1){
            while (round > 0){
                for(int i=c.length-1;i>=0;i--){
                    result += (iteration + 1) * c[i];
                    counter++;
                    if(counter == k){
                        iteration++;
                        counter = 0;
                        round--;
                    }
                }
                round--;
            }
        }else {
            for(int i=0;i<c.length;i++){
                result += (iteration + 1) * c[i];
            }
        }
        return result;
    }
}
