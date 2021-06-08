package com.hackerrank.problem_solving.medium.ThreeD_Surface_Area;

import java.util.List;

public class Result {
    /*
     * Complete the 'surfaceArea' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY A as parameter.
     */

    public static int surfaceArea(List<List<Integer>> A) {
        // Write your code here
        int result = 0;
        int rowSize = A.size();
        int columnSize = A.get(0).size();
        int lastIndex = A.size()-1;
        int left = 0,right = 0,front = 0,back = 0;
        int currentValue = 0;
        if(rowSize == 1 && columnSize == 1){
            return (A.get(0).get(0)*4)+2;
        }else if(rowSize == 1 && columnSize != 1){
            result += columnSize *2;
            for(int i=0;i<columnSize;i++){
                currentValue = A.get(0).get(i);
                left = currentValue;
                right = currentValue;
                front = i == 0 ? currentValue : currentValue > A.get(0).get(i-1) ? currentValue-A.get(0).get(i-1) : 0;
                back = i == columnSize-1 ? currentValue : currentValue > A.get(0).get(i+1) ? currentValue - A.get(0).get(i+1) : 0;
                result += left+right+front+back;
            }
        }else if(columnSize == 1 && rowSize !=1){
            result += rowSize *2;
            for(int i=0;i<rowSize;i++){
                currentValue = A.get(i).get(0);
                left = i == 0 ? currentValue : currentValue > A.get(i-1).get(0) ? currentValue - A.get(i-1).get(0) : 0;
                right = i == rowSize-1 ? currentValue : currentValue > A.get(i+1).get(0) ? currentValue - A.get(i+1).get(0) : 0;
                front = currentValue;
                back = currentValue;
                result += left+right+front+back;
            }
        }else {
            result += (rowSize*columnSize)*2;
            for(int row=0;row<rowSize;row++){
                currentValue = 0;
                for(int column=0;column<columnSize;column++){
                    currentValue = A.get(row).get(column);
                    if(row == 0){
                        if(column==0){
                            front = currentValue;
                            right = currentValue > A.get(row+1).get(column) ? currentValue - A.get(row+1).get(column) : 0;
                            back = currentValue > A.get(row).get(column+1) ? currentValue - A.get(row).get(column+1) : 0;
                            left = currentValue;
                        }else if(column>0 && column<columnSize-1){
                            front = currentValue > A.get(row).get(column-1) ? currentValue - A.get(row).get(column-1) : 0;
                            right = currentValue > A.get(row+1).get(column) ? currentValue - A.get(row+1).get(column) : 0;
                            back = currentValue > A.get(row).get(column+1) ? currentValue - A.get(row).get(column+1) : 0;
                            left = currentValue;
                        }else {
                            front = currentValue > A.get(row).get(column-1) ? currentValue - A.get(row).get(column-1) : 0;
                            right = currentValue > A.get(row+1).get(column) ? currentValue - A.get(row+1).get(column) : 0;
                            back = currentValue;
                            left = currentValue;
                        }
                    }else if(row>0 && row<rowSize-1){
                        if(column==0){
                            front = currentValue;
                            right = right = currentValue > A.get(row+1).get(column) ? currentValue - A.get(row+1).get(column) : 0;
                            back = currentValue > A.get(row).get(column+1) ? currentValue - A.get(row).get(column+1) : 0;
                            left = currentValue > A.get(row-1).get(column) ? currentValue - A.get(row-1).get(column) : 0;
                        }else if(column>0 && column<columnSize-1){
                            front = currentValue > A.get(row).get(column-1) ? currentValue - A.get(row).get(column-1) : 0;
                            right = right = currentValue > A.get(row+1).get(column) ? currentValue - A.get(row+1).get(column) : 0;
                            back = currentValue > A.get(row).get(column+1) ? currentValue - A.get(row).get(column+1) : 0;
                            left = currentValue > A.get(row-1).get(column) ? currentValue - A.get(row-1).get(column) : 0;
                        }else {
                            front = currentValue > A.get(row).get(column-1) ? currentValue - A.get(row).get(column-1) : 0;
                            right = right = currentValue > A.get(row+1).get(column) ? currentValue - A.get(row+1).get(column) : 0;
                            back = currentValue;
                            left = currentValue > A.get(row-1).get(column) ? currentValue - A.get(row-1).get(column) : 0;
                        }
                    }else {
                        if(column==0){
                            front = currentValue;
                            right = currentValue;
                            back = currentValue > A.get(row).get(column+1) ? currentValue - A.get(row).get(column+1) : 0;
                            left = currentValue > A.get(row-1).get(column) ? currentValue - A.get(row-1).get(column) : 0;
                        }else if(column>0 && column<columnSize-1){
                            front = currentValue > A.get(row).get(column-1) ? currentValue - A.get(row).get(column-1) : 0;
                            right = currentValue;
                            back = currentValue > A.get(row).get(column+1) ? currentValue - A.get(row).get(column+1) : 0;
                            left = currentValue > A.get(row-1).get(column) ? currentValue - A.get(row-1).get(column) : 0;
                        }else {
                            front = currentValue > A.get(row).get(column-1) ? currentValue - A.get(row).get(column-1) : 0;
                            right = currentValue;
                            back = currentValue;
                            left = currentValue > A.get(row-1).get(column) ? currentValue - A.get(row-1).get(column) : 0;
                        }
                    }
                    result += left+right+front+back;
                }
            }
        }
        return  result;
    }
}
