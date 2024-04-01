package com.green.day13.ch6;

public class CallStackTest {
    public static void main(String[]args){

        firstmethod();//메소드 호출
    }


    public static void firstmethod(){
        System.out.println("call firstMethod");
        secondMethod();
    }



    public static void secondMethod(){
        System.out.println("secondMethod");

    }
}
