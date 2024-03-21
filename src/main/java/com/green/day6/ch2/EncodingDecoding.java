package com.green.day6.ch2;

public class EncodingDecoding {
    public static void main(String[] args){
        char c = 'B';
        //int i = (int)c; << 자동현변환이 되기 때분에 (int)는 사용안함
        int i =c;//인코딩

        char c2 = (char)i;// 디코딩

        System.out.printf("c: %c, i: %d, c2 : %c\n", c, i, c2);

    }
}
