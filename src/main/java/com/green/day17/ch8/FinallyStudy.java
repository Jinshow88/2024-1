package com.green.day17.ch8;

public class FinallyStudy {
    public static void main(String[]args){
        method(1);
    }
    public static void method(int val){
        try{
            if(val%2==0){
                return;
            }
        }catch (Exception e){
            System.out.println("비상!!비상!!");
        }finally {
            System.out.println("------------------------");
        }
        System.out.println("__________________________");
    }
}
