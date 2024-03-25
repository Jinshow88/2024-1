package com.green.day8.ch4;

public class FlowEx16_2 {
    public static void main(String[] args){
        int star = 5;

        for(int i=1; i<=star; i++){
            for(int e=1; e<=star; e++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /*
        star 값이 5라면 별을 5개 가로로 5줄 출력한다. (마지막 개행)
        *****
        *****
        *****
        *****
        *****

        star 값이 5라면 별을 3개 가로로 3줄 출력한다. (마지막 개행)
        ***
        ***
        ***

         */
    }
}
