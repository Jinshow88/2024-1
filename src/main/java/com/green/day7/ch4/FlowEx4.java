package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args){
        /*
        scanner를 통해 점수를 입력받으세요.
        점수는 정수로 바로 받으시고, grade(학점)을 관리할 문자타입을 선언해주세요
        만약 점수가 90점 이상이면 grade에 A값을 저장하고
        만약 점수가 80점 이상이면 grade에 B값을 저장하고
        만약 점수가 70점 이상이면 grade에 C값을 저장하고
        69점 이하라면 grade에 D값을 저장하세요.

        (출력)당신의 학점은 ? 입니다.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 >>> ");
        String input = scan.next();

        int grade = Integer.parseInt(input);


//        if(grade >= 90){
//            System.out.println("당신의 학점은 A입니다.");
//        }else if (grade >=80){
//            System.out.println("당신의 학점은 B입니다.");
//        }else if(grade >= 70){
//            System.out.println("당신의 학점은 C입니다.");
//        }else {
//            System.out.println("당신의 학점은 D입니다.");
//        }


        switch (grade/10) {
            case 9:
                System.out.println("당신의 학점은 A입니다.");
                break;
            case 8:
                System.out.println("당신의 학점은 B입니다.");
                break;
            case 7:
                System.out.println("당신의 학점은 C입니다.");
                break;
            default:
                System.out.println("당신의 학점은 D입니다.");

        }




    }
}
