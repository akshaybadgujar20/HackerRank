package com.hackerrank.thirty_days_of_code.Data_Types;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int intResult;
        double doubleResult;
        String stringResult;
        intResult = scan.nextInt();
        doubleResult = scan.nextDouble();
        scan.nextLine();
        stringResult = scan.nextLine();
        System.out.println(i+intResult);
        System.out.println(d+doubleResult);
        System.out.println(s.concat(stringResult));


        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
