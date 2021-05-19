package com.hackerrank.problem_solving.medium.Climbing_the_Leaderboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Result {
    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        ranked = ranked.stream().distinct().collect(Collectors.toList());
        int currentRank = 0;
        int score = 0;
        int previousRank = 0;
        int size = ranked.size()-1;
        for(int index=0;index<player.size();index++){
            score = player.get(index);
            for(int i=size;i>=0;i--){
                currentRank = ranked.get(i);
                previousRank = 0;
                size=i;
                if(i>0){
                    previousRank = ranked.get(i-1);
                }
                if(score>currentRank && score<previousRank){
                    result.add(i+1);
                    break;
                }else if(score==currentRank){
                    result.add(i+1);
                    break;
                }else if(score<currentRank){
                    result.add(i+2);
                    break;
                }if(previousRank == 0 && score>currentRank){
                    result.add(i+1);
                    break;
                }
            }
        }
        return result;
    }


}
