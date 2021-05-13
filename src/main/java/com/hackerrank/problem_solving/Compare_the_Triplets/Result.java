package com.hackerrank.problem_solving.Compare_the_Triplets;

import java.util.ArrayList;
import java.util.List;

public class Result {
    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> resultList = new ArrayList<>();
        resultList.add(0);
        resultList.add(0);
        int temp;
        for(int index=0;index<a.size();index++){
            temp = 0;
            if(a.get(index) > b.get(index)){
                temp = resultList.get(0);
                resultList.set(0,++temp);
            }else if(a.get(index) < b.get(index)){
                temp = resultList.get(1);
                resultList.set(1,++temp);
            }
        }
        return resultList;
    }
}
