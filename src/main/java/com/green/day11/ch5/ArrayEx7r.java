package com.green.day11.ch5;

import java.util.Arrays;

public class ArrayEx7r {
    public static void main(String[] args){
        int[] numArr = new int[10];


        for(int i=0; i< numArr.length; i++){
            numArr[i] = i+10;
        }
        for(int i=0;i<numArr.length;i++){
            int game = (int)(Math.random() * numArr.length);
            int tmp = numArr[i];
            numArr[i] = numArr[game];
            numArr[game] = tmp;


        }
        System.out.print(Arrays.toString(numArr));







        //10, 11, 12, ... 19
    }
}
