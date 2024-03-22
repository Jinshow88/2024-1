package com.green.day6.ch2;

public class OverFlowUnderFlow {
    public static void main(String[] args){
        int i = 127;

        byte b = 0; // -128 ~ 127


        int n3 = -10;
        //n3를 byte로 형변환을 할 것이다.
        //형변환 할 수 있는 값인지 체크하는 if문 작성해 주세요.

        if(Byte.MIN_VALUE <= n3 && n3 <= Byte.MAX_VALUE) {

        }




//        if(n3<128){
//            System.out.println("0");
//        }else if(n3>-129){
//            System.out.println("o");
//        }else
//            System.out.println("x");


        int i2 = - 129;
        byte b2 = (byte)i2;
        System.out.println("b2: " + b2);


        if(Byte.MAX_VALUE >= i) {
            b = (byte) i;
            System.out.println("b: " + b);
        }
        if(Byte.MIN_VALUE <= i2){

        }
    }
}
