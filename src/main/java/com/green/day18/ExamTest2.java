package com.green.day18;

import java.util.Arrays;

public class ExamTest2 {
    public static void main(String[] args) {
        Exam2.printGugun(2, 4);
        /*
        2X1=2 3X1=3 4X1=4
        ...
        2X9=18 3X9=27 4X9=36
         */

//        int sum = Exam.getSumFromString("33421");//3+3+4+2+1
        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));
        Exam2.inputRandomValue(arr);//1~9사이의 랜덤값 중복없이
        System.out.println(Arrays.toString(arr));
    }
}

class Exam2 {

    static void inputRandomValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rVal = (int) (Math.random() * 9) + 1;
            arr[i] = rVal;

            for (int z = 0; z < i; z++) {
                if (arr[z] == rVal) {
                    i--;
                    break;
                }
            }
        }
    }

    static int getSumFromString(String n1) {
        int sum = 0;
        char[] charArr = n1.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            char ch = charArr[i];
            int val = Character.getNumericValue(ch);
            sum += val;
        }
        return sum;
    }


    static void printGugun(int n1, int n2) {
        for (int i = 1; i <= 9; i++) {
            for (int e = n1; e <= n2; e++) {
                System.out.printf("%d X %d = %d\t", e, i, i * e);

//                System.out.println(i+ " X "+ e +" = "+i*e);
            }
            System.out.println();
        }
    }
}