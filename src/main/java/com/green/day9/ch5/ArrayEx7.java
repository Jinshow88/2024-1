package com.green.day9.ch5;

public class ArrayEx7 {
    public static void main(String[] args){
        int[] numArr = new int[10];
        int game = (int)(Math.random() * 10);

        for(int i=0; i<10; i++){
            numArr[i] = i+10;
        }
        for(int i=0;i<10;i++){
            System.out.print(numArr[i]+", ");
        }







        //10, 11, 12, ... 19
    }
}
