package com.hackerrank.problem_solving.easy.Left_Rotation;

import java.util.ArrayList;
import java.util.List;

public class Result {
    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     *
     *  5 4
     *  1 2 3 4 5
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        if((arr.size() - d)==0)
            return arr;
        int temp = 0;
        for(int i=0;i<d;i++){
            temp = arr.get(0);
            arr.remove(0);
            arr.add(temp);
        }
        return arr;
    }
}
