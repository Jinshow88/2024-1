package com.green.day9.ch5;

public class ArrayStudy2 {
    public static void main(String[] args) {
        int[] numArr = new int[10];//0~99
        for (int i = 0; i < 10; i++) {

            System.out.printf("numArr[%d]: %d\n", i, numArr[i]);
        }
        for (int i = 0; i < 10; i++) {
            numArr[i] = i +1;

        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("numArr[%d]: %d\n", i, numArr[i]);
        }
    }
}
