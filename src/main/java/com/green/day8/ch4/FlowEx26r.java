package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx26r {
    public static void main(String[] args){

        int i = 0;
        int sum = 0;
        while ((sum += ++i) < 100){
            System.out.printf("sum: %d, i:%d\n",sum,i);
        }
        System.out.println("________________");
        System.out.println(i);


        /*
        1~1000
        값들을 계속 더할건데 더한값이 100 미만인 index값이 몇인지 구하시오.
         */
    }
}
