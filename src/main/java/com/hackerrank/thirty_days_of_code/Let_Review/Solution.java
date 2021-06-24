package com.hackerrank.thirty_days_of_code.Let_Review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<String> stringList = new ArrayList<>();
        sc.nextLine();
        for(int index=1;index<=count;index++){
            stringList.add(sc.nextLine().trim());
        }
        List<StringBuffer> stringBufferList = new ArrayList<>();
        for(int index=0;index<stringList.size();index++){
            String word = stringList.get(index);
            int i = 0;
            int j = 1;
            int interator = 0;
            StringBuffer result1 = new StringBuffer();
            StringBuffer result2 = new StringBuffer();
            if(word.length() % 2 == 0){
                while (i < word.length()){
                    result1.append(word.charAt(i));
                    result2.append(word.charAt(j));
                    i+=2;
                    j+=2;
                }
            }else {
                while (j<word.length()){
                    result1.append(word.charAt(i));
                    result2.append(word.charAt(j));
                    i+=2;
                    j+=2;
                }
                result1.append(word.charAt(word.length()-1));
            }
            stringBufferList.add(result1.append(" ").append(result2));
        }
        for(int index=0;index<stringBufferList.size();index++){
            System.out.println(stringBufferList.get(index));
        }
    }
}
