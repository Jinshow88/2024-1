package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요");
        int score = scan.nextInt();
        scan.close();

        if(score < 0 || score >=100){
            System.out.println("잘못된 점수 입니다.");
        }else {
            char grade = 'D';
            char symbol = '-';
            if (score >= 90) {
                grade = 'A';
                if(score >= 97){symbol = '+';}
                else if (score >=93){symbol = '0';}
            } else if (score >= 80) {
                grade = 'B';
                if (score >= 87) {
                    symbol = '+';
                } else if (score >= 83) {
                    symbol = '0';
                }

            }else{
                grade ='C';
            }
            System.out.printf("당신의 학점은 %c%c입니다.", grade, symbol);
        }



        /*
        scanner를 통해 점수를 입력받으세요.
        점수는 정수로 바로 받으시고,
        grade(학점)을 관리할 문자타입을 선언해주세요
        symbol(+-0)저장할 문자 타입 선언해주세요.
        만약 점수가 90점 이상이면 grade에 A값을 저장하고
        만약 점수가 80점 이상이면 grade에 B값을 저장하고
        나머지는 C학점 오로지 학점
        1점대가 0~2 -
               3~6 0
               7~9 +



        (출력)당신의 학점은 ? 입니다.
         */
    }
}
