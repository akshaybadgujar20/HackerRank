package com.hackerrank.thirty_days_of_code.Operators;

public class Result {
    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        System.out.println((int) Math.round(meal_cost + (meal_cost * (Double.valueOf(tip_percent)/100)) + (meal_cost * (Double.valueOf(tax_percent)/100))));
    }
}
