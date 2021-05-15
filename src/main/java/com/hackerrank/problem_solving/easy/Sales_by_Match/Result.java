package com.hackerrank.problem_solving.easy.Sales_by_Match;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int result =0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(Integer integer:ar){
            if(hashMap.get(integer) == null){
                hashMap.put(integer,1);
            }else {
                int temp = hashMap.get(integer);
                hashMap.put(integer,++temp);
            }
        }
        for(Map.Entry<Integer,Integer> map:hashMap.entrySet()){
            result += map.getValue()/2;
        }
        return result;
    }
}
