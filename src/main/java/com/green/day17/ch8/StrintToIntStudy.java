package com.green.day17.ch8;

public class StrintToIntStudy {
    public static void main(String[]args){
        int result = Utils.convertStringToInt("123");

        System.out.println("result : "+ result);
    }
}


class Utils {
    static int convertStringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return 0;
        }
    }
}