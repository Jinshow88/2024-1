package com.green.day9.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        int ss = 0;
        int sum = 0;
        int i = 0;
        while (sum < 100) {
            i++;
            sum = sum + i;

            ss = i;
            System.out.println(ss);
        }


    }
}



        /*
        1~n까지 더하는데 100이 막 넘은 index값과 sum값을 출력한다.
        I :14, sum : 105
        while문으로 해결
         */


