package com.green.day5;

public class MissionGradeV2 {
    public static void main(String[] args) {
        //int score = -10~120 사이의 랜덤 정수 값 나올 수 있도록 해주세여.
        int score = (int)(Math.random() * 131) - 10;

        if(score>100 || score<0){
            System.out.println("점수가 잘못되었습니다.");
        }

        int val1 = score / 10;
        int val2 = score % 10;




















    }
}
