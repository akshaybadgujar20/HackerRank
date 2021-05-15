package com.hackerrank.problem_solving.easy.Repeated_String;

public class Result {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here
        long result =0;
        long times = n/s.length();
        String[] stringArray = s.split("");
        int count = 0;
        count = countOccurances(stringArray);
        result += times * count;
        stringArray = s.substring(0, (int) (n%s.length())).split("");
        count = 0;
        count = countOccurances(stringArray);
        result += count;
        return result;
    }

    public static int countOccurances(String[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equalsIgnoreCase("a")){
                count++;
            }
        }
        return count;
    }
}
