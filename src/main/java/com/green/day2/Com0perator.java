package com.green.day2;

//비교 연상자
//comparison operator
public class Com0perator {
    public static void main(String[] args) {
        //정수형 데이터 타입인 int형
        //불린형, true, galse값만 가질 수 있는 데이터 타입
        boolean b1 = true;
        boolean b2 = false;
        //boolean b3 = 32;

        boolean r1 = 10 > 9; //10보다 9이 초과?
        System.out.println(r1);

        r1 = 10 < 9; //10이 9보다 미만?
        System.out.println(r1);

        r1 = 10 >= 9; //10이 9보다 이상?
        System.out.println(r1);

        r1 = 10 <= 10 ; //10이 10보다 이하?
        System.out.println(r1);

        r1 = 10 == 10;
        System.out.println(r1);

        r1 = 10 != 10; //!는 not 또는 반대 개념
        System.out.println(r1);


    }
}
