package com.green.day9.ch5;

public class ArrayEx6_2 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};
        int ss = 0;
        int dd = score[0];


        for (int i = 0; i < score.length; i++) {
            if (score[i] > ss) {
                ss = score[i];
            } else if (score[i] < dd) {

            }
            System.out.println(ss);
            System.out.println(dd);

        /*
        score에서 가자 큰 값, 가장 작은 값 찾아내서 출력
        min: 33, max 100
         */
        }


    }
}