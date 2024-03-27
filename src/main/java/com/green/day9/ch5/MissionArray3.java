package com.green.day9.ch5;

public class MissionArray3 {
    public static void main(String[] args) {
        int[] numArr = {10, 20, 30};
        int ee=0;
        ee = numArr[0];

        numArr[0]=numArr[2];
        numArr[2]=ee;

        for(int i=0; i<3; i++){
            System.out.println(numArr[i]);




        /*
        스와핑, 0번칸, 2번칸 스와핑해주세요
         */

        }
    }
}
