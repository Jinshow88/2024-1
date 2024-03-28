package com.green.day11.ch6;

public class TvTest4 {
    public static void main(String[] args){
        //Q1. Tv객체의 주소값을 3개 저장할수 있는 배열을 만들어 주세요


//        thArr[0] >> 배열의 방
//        thArr[1]
//        thArr[2]
        Tv[] tvArr = new Tv[3]; //Tv[] >>> 타입 명
        //Q2. 각 방에 Tv객체의 주소값을 넣어 준다. 모두 동일하지 않다.

        for(int i=0; i< tvArr.length; i++){
            tvArr[i] = new Tv();
        }

        for(Tv tv : tvArr){
            System.out.println(tv);
        }


        //Q3. 0번방 Tv는 채널 11, 1번방 채널 Tv는 채널 12, 2번방 tV는 채널 13

        for(int i=0; i< tvArr.length; i++){
//            int th = (int)(Math.random() * 3) +11;
            tvArr[i].channel = i + 11;

            System.out.println(tvArr[i].channel);
        }



    }
}
