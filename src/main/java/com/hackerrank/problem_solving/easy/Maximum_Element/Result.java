package com.hackerrank.problem_solving.easy.Maximum_Element;

import java.util.*;

public class Result {
    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
        // Write your code here
        List<Integer> resultList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<Integer> maxList = new ArrayList<>();
        maxList.add(0);
        for(int i=0;i<operations.size();i++){
            if(operations.get(i).length()>1){
                String[] array = operations.get(i).split(" ");
                int number = Integer.valueOf(array[1]);
                if(number>maxList.get(maxList.size()-1) || number == maxList.get(maxList.size()-1))
                    maxList.add(number);
                integerList.add(number);
            }else {
                if(operations.get(i).equalsIgnoreCase("2")){
                    if(integerList.get(integerList.size()-1).equals(maxList.get(maxList.size()-1))){
                        integerList.remove(integerList.size()-1);
                        maxList.remove(maxList.size()-1);
                    }else {
                        integerList.remove(integerList.size()-1);
                    }
                }else {
                    resultList.add(maxList.get(maxList.size()-1));
                }
            }
        }
        System.out.println("========");
        return resultList;
    }
}
