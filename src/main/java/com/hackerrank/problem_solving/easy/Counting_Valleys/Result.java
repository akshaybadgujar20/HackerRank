package com.hackerrank.problem_solving.easy.Counting_Valleys;

public class Result {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int result = 0;
        int level = 0;
        int valley = 0;
        String[] pathArray = path.split("");
        for(int index =0;index<pathArray.length;index++){
            if(pathArray[index].equalsIgnoreCase("D")){
                level--;
            }else {
                level++;
                if(level == 0){
                    valley++;
                }
            }
        }
        result = valley;
        return result;
    }
}
