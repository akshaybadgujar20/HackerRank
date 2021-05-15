package com.hackerrank.problem_solving.Time_Conversion;

public class Result {
    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String result = null;
        String[] timeArray = s.split(":");
        StringBuilder sb = new StringBuilder();
        boolean isAM = false;
        if(timeArray[2].substring(2,4).equalsIgnoreCase("AM")){
            isAM = true;
        }
        if(isAM){
            if(timeArray[0].equalsIgnoreCase("12")){
                sb.append("00");
            }else {
                sb.append(timeArray[0]);
            }
        }else {
            if(timeArray[0].equalsIgnoreCase("12")){
                sb.append("12");
            }else {
                int AM = 12;
                sb.append(String.valueOf(AM+Integer.parseInt(timeArray[0])));
            }
        }
        sb.append(":");
        sb.append(timeArray[1]+":");
        sb.append(timeArray[2].substring(0,2));
        result = String.valueOf(sb);
        return result;
    }
}
