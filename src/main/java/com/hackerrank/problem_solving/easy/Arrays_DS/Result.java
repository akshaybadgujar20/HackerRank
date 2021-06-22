package com.hackerrank.problem_solving.easy.Arrays_DS;

import java.util.ArrayList;
import java.util.List;

public class Result {
    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        int highIndex = a.size()-1;
        int length = 0;
        int temp = 0;
        if(a.size() == 1){
            return a;
        }
        if(a.size()%2 == 1){
            length = ((a.size()-1)/2)-1;

        }else if(a.size()%2 == 0){
            length = (a.size()/2)-1;
        }
        for(int index=0;index<=length;index++){
            temp = a.get(index);
            a.set(index,a.get(highIndex));
            a.set(highIndex,temp);
            highIndex--;
        }
        return a;
    }
}
