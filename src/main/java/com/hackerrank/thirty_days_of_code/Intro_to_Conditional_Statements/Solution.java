package com.hackerrank.thirty_days_of_code.Intro_to_Conditional_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N % 2 == 0 && (N>=2 && N<=5)){
            System.out.println("Not Weird");
        }else if(N % 2 == 0 && (N>=6 && N<=20)){
            System.out.println("Weird");
        }else if(N % 2 == 0 && N>20){
            System.out.println("Not Weird");
        }else if(N==1 || (N % 3 == 0 || N % 3 == 1 || N % 3 == 2)){
            System.out.println("Weird");
        }
        bufferedReader.close();
    }
}
