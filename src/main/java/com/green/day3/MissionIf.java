package com.green.day3;

import java.util.Scanner;

public class MissionIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요.(남/여) >>");
        String gender = scan.nextLine();
//        System.out.println(gender);
//        System.out.println("-끝-");

        //만약 "남" > "당신은 남자입니다."
        //만약 "여" > "당신은 여자입니다."
        //만약 "남,여도 아니면" > 성별을 입력해 주세요."

        if(gender.equals("남")) {
            System.out.println("당신은 남자입니다.");
        } else if(gender.equals("여")) {
            System.out.println("당신은 여자입니다.");
        } else {
            System.out.println("성별을 입력해 주세요.");
        }
        System.out.println("-끝-");


    }
}
