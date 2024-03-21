package com.green.day4;

public class MissionABC {
    public static void main(String[] args){
        int val =(int)(Math.random() * 21) - 10;

        System.out.println("원본 : " + val);


        System.out.println(val < 0 ? -val : val);






        if (val < 0) {
            val = -val;
        }
        System.out.println(val);





        if(val>=0){
            System.out.println(val);
        } else {
            System.out.println(-val);
        }

    }
}
