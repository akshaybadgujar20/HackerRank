package com.hackerrank.problem_solving.medium.The_Time_in_Words;

public class Result {
    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */
    public static String timeInWords(int h, int m) {
        // Write your code here
        String result = null;
        StringBuilder sb = new StringBuilder();
        if(m == 0){
            sb.append(getHour(h)+" ");
            sb.append("o' clock");
        }else {
            if(m==15){
                sb.append("quarter ");
                sb.append("past ");
                sb.append(getHour(h));
            }else if(m==30){
                sb.append("half past ");
                sb.append(getHour(h));
            }else if(m>0 && m<30){
                sb.append(buildMinutes(m));
                if(m<10){
                    sb.append(" minute past ");
                }else {
                    sb.append(" minutes past ");
                }
                sb.append(getHour(h));
            }else if(m==45){
                sb.append("quarter ");
                sb.append("to ");
                sb.append(getHour(h+1));
            }else if(m>30 && m<=59){
                sb.append(buildMinutes(60-m)+" ");
                sb.append("minutes to ");
                sb.append(getHour(h+1));
            }
        }
        return sb.toString();
    }

    public static CharSequence buildMinutes(int m){
        StringBuilder minutes = new StringBuilder();
            if(m<20){
                return getHour(m);
            }else {
                minutes.append(getTens(((m/10)*10)));
                if((m%10) >0){
                    minutes.append(" "+getHour((m%10)));
                }
            }
        return minutes;
    }

    private static CharSequence getTens(int i) {
        if(i==10){
            return "ten";
        }else if(i==20){
            return "twenty";
        }else if(i==30){
            return "thirty";
        }else if(i==40){
            return "fourty";
        }else{
            return "fifty";
        }
    }

    public static String getHour(int h){
        if(h==1){
            return "one";
        }else if(h==2){
            return "two";
        }else if(h==3){
            return "three";
        }else if(h==4){
            return "four";
        }else if(h==5){
            return "five";
        }else if(h==6){
            return "six";
        }else if(h==7){
            return "seven";
        }else if(h==8){
            return "eight";
        }else if(h==9){
            return "nine";
        }else if(h==10){
            return "ten";
        }else if(h==11){
            return "eleven";
        }else if(h==12){
            return "twelve";
        }else if(h==13){
            return "thirteen";
        }else if(h==14){
            return "fourteen";
        }else if(h==15){
            return "fifteen";
        }else if(h==16){
            return "sixteen";
        }else if(h==17){
            return "seventeen";
        }else if(h==18){
            return "eighteen";
        }else{
            return "nineteen";
        }
    }
}
