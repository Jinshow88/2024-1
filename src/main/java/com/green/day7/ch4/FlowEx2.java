package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args){
        /*
        Scanner 객체를 이용하여 콘솔에서 문자열 값을 가져온다.
        받은 문자열을 숫자로 파싱한다.
        파싱한 숫자가 0이라면 >> 입력하신 숫자는 0입니다. (출력)
                    0이 아니라면 >> 입력하신 숫자는 0이 아닙니다.
                                  입력하신 숫자는 ? 입니다. (출력)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요. >>>");
        String input = scan.next();

        int mm = Integer.parseInt(input);
        if(mm == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        }else
            System.out.printf("입력하신 숫자는 0이 아닙니다.\n입력하신 숫자는 %s입니다.", mm);

//        String refult = switch(mm) {
//            case 0 -> "입력하신 숫자는 0입니다.";
//            default -> String.format("입력하신 숫자는 0이아닙니다.\n 입력하신 숫자는%d입니다.", mm);
//        };






    }
}
