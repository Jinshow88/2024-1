package com.green.day5.ch2;

public class VarEx2 {
    public static void main(String[] args){
        int x = 10, y = 20;
        System.out.println("x: " + x + ",y: " + y);

        /*
        x가 가지고 있는 값과, y가 가지고 있는 값을
        서로 교환을 할 겁니다.
        조건1) 리터럴 값은 사용할수 없습니다.
        조건2) 조건1만 지키면 무엇이든지 해도됨.

        */

//        int c = 0;
//        int d = 0;
//        c = y;
//        d = x;
//
//        x = c;
//        y = d;


        int c = x;
        x = y;
        y = c;




        System.out.println("x: " + x + ",y: " + y);
        //x=20,y=10



    }
}
