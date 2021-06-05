package com.hackerrank.problem_solving.medium.Encryption;

import java.util.List;

public class Result {
    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
        // Write your code here
        String result = null;
        String statement = s.replace(" ","");
        int length = statement.length();
        int mid = (int) Math.abs(Math.sqrt(length));
        int rows = 0;
        int columns = 0;
        if((mid*mid)<length){
            rows = mid;
            columns = mid+1;
        }else {
            columns = mid;
            rows = mid-1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<columns;i++){
            int j = i;
            while ( j<length){
                sb.append(statement.charAt(j));
                j += columns;
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
