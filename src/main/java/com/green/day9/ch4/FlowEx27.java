package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("합계를 구할 숫자를 입력하세요.(종료 : 0) >> ");
        int ss = scan.nextInt();
        int sum = 0;
        while (ss!=0){
            if(ss!=0){
                sum = ss+ sum;

            }
            System.out.print("합계를 구할 숫자를 입력하세요.(종료 : 0) >> ");
            System.out.print(sum+" + ");
            ss = scan.nextInt();




        }
        System.out.println("sum : " + sum);




        /*
        가이드 출력 "합계를 구할 숫자를 입력하세요.(종료 : 0) >> "
        가이드 출력이 계속된다. 0을 입력할때 까지...
        입력한 모든 숫자를 더한 값을 마지막에 출력한다.
        출력포멧은 자유
         */
    }
}
