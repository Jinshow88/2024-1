package com.green.day9.ch5;

public class MissionArru22 {
    public static void main(String[] args){
        int[] time = new int[10];
//        int num =(int)(Math.random() * 23) + 10;

        for(int i=0; i< time.length; i++){
            int num =(int)(Math.random() * 21) + 10;
            time[i] = num;

            System.out.printf("time[%d] = %d\n",i, num);
        }






        /*
        정수값 10개 저장할 수 있는 배열 생성
        10칸 초기화 하는데 10~30랜덤값이 세팅 될 수 있도록 해주세요.
         */
    }
}
