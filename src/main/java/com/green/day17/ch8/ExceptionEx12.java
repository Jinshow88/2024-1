package com.green.day17.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) {
//        div(10,0);
//        divTry(10, 0);
    }

    public static void div(int n1, int n2) throws Exception {
        System.out.println(n1 / n2);

    }

    public static void divtry(int n1, int n2) throws Exception {
        try {
            System.out.println(n1 / n2);
        }catch (Exception e){
            System.out.println("0으로 나누면 안되");
        }
    }

}
