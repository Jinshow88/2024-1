package com.green.day4;

public class Aaaa {
    public static void main(String[] args) {
        int star =(int)(Math.random() * 5) + 3;
        System.out.println(star);

        for(int i=0 ; i < star; i++){
            for(int z=0; z<=i; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
