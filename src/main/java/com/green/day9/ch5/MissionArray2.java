package com.green.day9.ch5;

public class MissionArray2 {
    public static void main(String[] args) {


        int[] numArr = {10, 20, 30, 40};
        for (int i = 0; i < numArr.length; i++) {
//            numArr[i]=i;
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
            if ((numArr.length - 1) != i) {
                System.out.print(",");
            }

//        for (int i = 0; i < numArr.length; i++) {
//
//            if ((numArr.length - 1) != i) {
//                System.out.print(numArr[i] + ",");
//            } else {
//                System.out.print(numArr[i]);
//            }






        /*
        for문 활용
        10,20,30,40 (출력)
         */


        }
    }
}