package com.green.day3;

public class MissionMultipleForLoop {
    public static void main(String[] args) {
        //int star = 2~6사이의 랜덤값이 나올 수 있도록 세팅
        int star = (int) (Math.random() * 5) + 2;
        System.out.println(star);

        for (int z = 0; z < star; z++) {
            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
