package com.green.day11.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int ee = 0;
        double dd = 0;
        int[][] score = {
                {100, 90, 80}
                , {20, 25, 35}
                , {30, 30, 30}
                , {40, 40, 40}
        };
        for (int e = 0; e < score.length; e++) {
//            for (int i = 0; i < score[e].length; i++) {
            ee = score[e][0] + ee;
            dd = ee / score.length;


        }
        System.out.printf("칸의 합계값 : %s, 평균값 : %s\n", ee, dd);

    }
}


