package com.green.day9.ch5;

public class ArrayEx5r {
    public static void main(String[] args) {
        int[] score = {100, 88, 100, 100, 90};
        int ss = 0;
        double dd = 0;
        for (int i = 0; i < score.length; i++) {
            ss = score[i] + ss;
//            dd=ss/5;
//            System.out.println(ss);
        }
        dd = ss / score.length;
        System.out.println("총점 = " + ss);
        System.out.printf("평균 = %.2f",dd);


        /*
          d = 정수
          f= 실수 >>>> f .2 (소수점 두번째) .3(소수점 세번째)
          s = 문자열
         */





        /*
        학생들의 국어점수 입니다.
        총점과 평점 출력해주세요.
        포맷은 자유
         */
    }
}
