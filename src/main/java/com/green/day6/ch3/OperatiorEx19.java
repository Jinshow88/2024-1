package com.green.day6.ch3;

public class OperatiorEx19 {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;
        System.out.printf("x / y = %d (몫)\n", x / y);
        System.out.printf("x %% y = %d (나머지)\n", x % y);

        int x2= 7;
        System.out.printf("x2 / y = %d (몫)\n", x2 / y);
        System.out.printf("x2 %% y = %d (나머지)\n", x2 % y);

        System.out.println(10 % 8); // 뒷쪽의 부호 -는 의미는 없고 앞의 부호에서 결과값의 부호가 결정된다
        System.out.println(-10 % 8);
        System.out.println(10 % -8);
        System.out.println(-10 % -8);
    }
}
