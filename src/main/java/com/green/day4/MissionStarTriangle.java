package com.green.day4;

public class MissionStarTriangle {
    public static void main(String[] args) {
        //int star = 3~7사이의 랜덤값
        int star =(int)(Math.random() * 5) + 3;
        System.out.println(star);

        for (int i=0; i<star; i++) {
            for (int z=0; z<=i; z++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }
}
