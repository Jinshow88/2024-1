package com.green.day9.ch4;

public class FlowEx29r {
    public static void main(String[] args){
//        int game =(int)(Math.random() * 100) +1;
        long startTime = System.currentTimeMillis();

        for(int i =1; i<=100; i++){
            System.out.printf("i=%d ",i);
            int copy =i;

            do{
                int oneDigit = copy % 10;
                if(oneDigit != 0 && oneDigit % 3 ==0){
                    System.out.print("짝");
                }
            }while ((copy/=10) > 0);
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
