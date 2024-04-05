package com.green.day17.ch8;

public class ExceptionEx1 {
    public static void main(String[]args){

        try{
            int a = 10;
            int b = 20;
            int c = 10/0;
        }catch (ArithmeticException e){
            System.out.println("수학적 예외 발생!!");
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("비상!! 비상!! ");
        }finally {
            System.out.println("실행");
        }
        System.out.println("__________________");
    }
}
