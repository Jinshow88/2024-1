package com.green.day8.ch4;

public class FlowEx18r {
    public static void main(String[] args) {
        for (int d = 2; d <= 2; d++) {
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d x %d = %d\n", d,i,d * i);


            /*2~9단 출력
             2 x 1 = 2
             ...
             9 x 9 = 81
             */
            }
            System.out.println("_______");

        }
    }
}
