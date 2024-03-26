package com.green.day9.ch4;

public class FlowEx29 {
    public static void main(String[] args){
//        int game =(int)(Math.random() * 100) +1;
        int game = 0;
        for(int i=1; i<=100; i++){
            System.out.print(i);
            if(i%10 == 3){
                System.out.print("짝");
            } else if (i % 10 == 6) {
                System.out.print("짝");
            } else if (i % 10 == 9) {
                System.out.print("짝");
            }

            if(i/10 == 3){
                System.out.print("짝");
            } else if (i / 10 == 6) {
                System.out.print("짝");
            } else if (i / 10 == 9) {
                System.out.print("짝");
            }
            System.out.println();

        }






        /*
        1~100까지
        3,6,9게임
        1
        2
        3 짝
        4
        ...
        99 짝짝
        100
         */
    }
}
