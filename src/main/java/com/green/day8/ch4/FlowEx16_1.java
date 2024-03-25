package com.green.day8.ch4;

public class FlowEx16_1 {
    public static void main(String[] atgs){
        int star = 5;
        System.out.println("star = " + star);

        for(int i=1; i<=5; i++){
            star = i;
            System.out.print("*");
        }
        /*
        star값이 5라면 별을 5개 가로로 출력한다.(마지막 개행)
        *****
        star 값이 3이라면 별을 3개 가로로 출력한다. (마지막 개행)
        ***
         */
    }
}
