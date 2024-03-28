package com.green.day11.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int len = 10;
        int[] numArr = new int[len];
        int[] counterArr = new int[len];
//        Q1. numArr 모든 방에 0~9사이의 랜덤값을 넣어주세요.
        for (int i = 0; i < numArr.length; i++) {
            int ee = (int) (Math.random() * 10);
            numArr[i] = ee;

        }
        System.out.println(Arrays.toString((numArr)));
        System.out.println("____________________");
//          Q2. numArr 각 칸에 들어있는 값의 갯수를 counterArr에 정리한다.
//          [4, 7, 2, 8, 8, 1, 5, 1, 8, 6]
//          counterArr[0] 은 0
//          counterArr[1] 은 2
//          counterArr[2] 은 1
        int dd = 0;
        for (int i = 0; i < counterArr.length; i++) {
            for (int e = 0; e < counterArr.length; e++) {
                dd = dd++ ;
                counterArr[e] = dd;


                System.out.println(Arrays.toString((counterArr)));

            }
        }
    }
}
