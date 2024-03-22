package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("성적을 입력해 주세요 >>>>");
        int mm = scan.nextInt();

//        String ee = switch(mm/10){
//            case 9 -> "당신의 학점은 A입니다.";
//            case 8 -> "당신의 학점은 B입니다.";
//            case 7 -> "당신의 학점은 C입니다.";
//            default -> "당신의 학점은 F입니다.";
//        };
//        System.out.println(ee);

        String ee = switch(mm/10){
            case 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            default -> "F";
        };
        System.out.printf("당신의 학점은 %s입니다.\n", ee);






        /*
        switch 사용
        90점 이상은 "당신의 학점은 A입니다."
        80점 이상은 "당신의 학점은 B입니다."
        70점 이상은 "당신의 학점은 C입니다."
        나머지는 "당신의 학점은 F입니다."
        10의 자리 숫자를 뽑아내서 switch로 해결


         */
    }
}
