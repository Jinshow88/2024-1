package com.green.day19;

public class ExamTest {
    public static void main(String[]args){
        String str = "1 2 3 4";
        String [] strArr = str.split(" ");

        //strArr 배열을 int 배열로 파싱 처리

        int[] intArr = new int[str.length()];
        for(int i=0; i<strArr.length; i++){
            intArr[i]=Integer.parseInt(strArr[i]);
        }
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);






    }
}

class Exam{


}