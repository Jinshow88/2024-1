package com.green.day14.ch6;

public class StarTest {
    public static void main(String[] args) {
        Star star = new Star();
        star.singlePrint(5);
        star.singlePrint(7);
        System.out.println("_______________________");
        star.squarePrint(2);
        System.out.println("_______________________");
        star.trianglePrint(4);
        System.out.println("_______________________");


    }
}


class Star {

    void singlePrint(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void squarePrint(int n) {
        for (int i = 0; i < n; i++) {
            singlePrint(n);
//            for(int z=0; z<n; z++){
//                System.out.print("*");

        }
//            System.out.println();
    }

    void trianglePrint(int n) {
        for (int i = 1; i <= n; i++) {
            singlePrint(i);
            }

        }
    }








