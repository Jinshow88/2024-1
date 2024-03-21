package com.green.day4;

public class MissionSumForEvenLoop {
    public static void main(String[] args){
        //1부터 100까지 짝수만 더한 값 출력

        int sum = 0;
        for(int i=1; i<101; i++){
            if(i%2 ==0){
//                sum = sum + i;
                sum += i;
            }
        }
        System.out.println(sum);


        int in = 0;
        for(int i=2; i<=100; i=+2){
            in =+ i;
        }
        System.out.println(in);
    }
}
