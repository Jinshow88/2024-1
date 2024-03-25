package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx17_1r {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요. >> ");
        int ss = scan.nextInt();

        for(int i = ss; i>0; i--){
            for(int d =1; d<= ss; d++){
                if(d<i){
                    System.out.print("_");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }





        System.out.println("___________________________");

        for (int i = 1; i <= ss; i++) {
            for (int e = ss - 1; e >= i; e--) {
                System.out.print("_");
            }
            for (int s = 1; s <= i; s++) {
                System.out.print("*");
            }
            System.out.println();





        /*
        Scanner를 히용하여 정수를 입력 받는다.
        가이드 내용 "*을 출력할 라인의 수를 입력하세요 >>"

        만약 정수값이 3이라면
        __*
        _**
        ***

        만약 정수값이 5라면
        ____*
        ___**
        __***
        _****
        *****

         */
        }
    }
}
