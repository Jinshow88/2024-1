package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx26 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >> ");
        int ss =scan.nextInt();


        int sum = 0;
        for(int i=1; i<=ss; i++){
            sum = sum + i;
            System.out.println(sum);
        }


        /*
        1~1000
        값들을 계속 더할건데 더한값이 100 미만인 index값이 몇인지 구하시오.
         */
    }
}
