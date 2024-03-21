package com.green.day3;

public class MissionForLoopGugudan {
    public static void main(String[] args) {
        int dan =(int)(Math.random() * 8) + 2; //2~9랜덤값
        System.out.println("dan : " + dan);

        for(int i=1; i<10; i++){
            System.out.println(dan + " x " + i + " = " + dan * i);
        }
    }
}
