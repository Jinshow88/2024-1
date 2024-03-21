package com.green.day6.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("두자리 정수를 하나 입력해주세요. >> ");
        String input = scan.next();

        int num = Integer.parseInt(input); //문자열을 숫자로 바꾸는 방법("123" > 123)
        System.out.println("num : " + num);
        System.out.println("num : " + (num + 1));

    }
}
