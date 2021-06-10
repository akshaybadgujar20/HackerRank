package com.hackerrank.interview_preparation_kit.Arrays.New_Year_Chaos;

import java.util.*;

public class Result {
    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int result = 0;
        int bribeSwap = 0;
        boolean isChaotic = false;
        List<List<Integer>> personList = new ArrayList<>();
        for(int i=0;i<q.size();i++){
            result = q.get(i) - (i+1);
            if(result >0 && result >2){
                isChaotic = true;
            }
            personList.add(Arrays.asList(q.get(i),(q.get(i) - (i+1))));
        }
        if(isChaotic){
            System.out.println("Too chaotic");
        }else {
//            printMatrix(personList);
            int i = 0;
            while (personList.size() > 0) {
                i= 0;
                while (i < personList.size()) {
                    if ((i==0 && personList.get(i).get(1) == 0) || (i==1 && personList.get(i).get(1) == 0 && personList.get(i-1).get(1) == 0) || (i==2 && personList.get(i).get(1) == 0 && personList.get(i-1).get(1) == 0 && personList.get(i-2).get(1) == 0)){
                        personList.remove(i);
                        i=0;
                        continue;
                    }
                    if (personList.get(i).get(1) > 0) {
                        int noOfSwap = personList.get(i).get(1);
                        int index = 1;
                        int no = 0;
                        int count = 0;
                        while (index <= noOfSwap) {
                            if (personList.get(i+index).get(1) < 0 || personList.get(i+index).get(1) == 0) {

                                personList.get((i + index) - 1).set(1,personList.get((i+index)-1).get(1) - 1);
                                personList.get(i + index).set(1,personList.get((i+index)).get(1) + 1);

                                //swapping values
                                no = personList.get((i + index) - 1).get(0);
                                count = personList.get((i + index) - 1).get(1);

                                personList.get((i + index) - 1).set(0,personList.get(i + index).get(0));
                                personList.get((i + index) - 1).set(1,personList.get(i + index).get(1));

                                personList.get(i + index).set(0,no);
                                personList.get(i + index).set(1,count);

                                bribeSwap++;
//                                printMatrix(personList);
                            } else {
                                break;
                            }
                            index++;
                        }
                    }
                    i++;
                }
            }
            System.out.println(bribeSwap);
        }
    }

    static void printMatrix(List<List<Integer>> personList){
        for(int i=0;i<personList.size();i++){
            System.out.println("value => "+personList.get(i).get(0)+" bribe swaps => "+personList.get(i).get(1));
        }
        System.out.println("\n==============================================\n");
    }
}
