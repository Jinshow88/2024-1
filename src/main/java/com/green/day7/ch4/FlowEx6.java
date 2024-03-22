package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 >>> ");
        int month = scan.nextInt();

        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("현재의 계절은 가을입니다.");
            case 12:
            case 1:
            case 2:
                System.out.println("현재의 계절은 겨울입니다.");
                break;
            default :
                System.out.println("잘못 입력하셨습니다.");
        }



        /*
        Scanner 객체를 사용하여 month(월) 값을 정수로 입력 받는다.

        month의 값이 3~5라면 ":"현재의 계절은 봄입니다." (출력)
                    6~8라면 "현재의 계절은 여름입니다."(출력)
                    9~11라면 "현재의 계절은 가을입니다."(출력)
                    12,1,2라면 "현재의 계절은 겨울입니다."(출력)
                    이외의 값은 "잘못입력하셨습니다."(출력)
         */
    }
}
