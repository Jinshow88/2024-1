package com.green.day9.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};
        int ss = 0;
        int dd = score[0];


        for (int i = 0; i < score.length; i++) {
            if (score[i] > ss) {
                ss = score[i];
            }

        /*
        score에서 가자 큰 값, 가장 작은 값 찾아내서 출력
        min: 33, max 100
         */
        }
        System.out.println(ss);
        for (int e = 0; e < score.length; e++) {
            if (score[e] < dd) {
                dd = score[e];
            }
        }

        System.out.println(dd);

    }
}