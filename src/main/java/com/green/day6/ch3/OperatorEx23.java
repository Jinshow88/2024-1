package com.green.day6.ch3;

public class OperatorEx23 {
    public static void main(String[]args){
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str1 == str2: " + (str1 == str2)); // 문자 비교는 equals사용해야됨
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        //동등성
        //동일성

    }
}
