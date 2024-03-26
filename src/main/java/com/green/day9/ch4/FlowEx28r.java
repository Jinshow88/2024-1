package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx28r {
    public static void main(String[] args) {
        int ss = (int) (Math.random() * 100) + 1;
//        int ss = 75;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("1~100 사이의 정수를 입력하세요 >> ");
            int sin = scan.nextInt();
            if (sin > ss) {
                System.out.println("Down");
            } else if (sin < ss) {
                System.out.println("Up");
            }else{
                System.out.println("정답");
                break;
            }
        }



        /*
        1~100사이의 랜덤값을 만들어 내고 랜덤값을 맞추는 게임
        1~100 사이의 정수를 입력하세요 >>
        입력한 숫자보다 정답이 크다 > "up"
        입력한 숫자보다 정답이 작다 > "Down"
        맞출때까지 반복한다.
         */
        }
    }

