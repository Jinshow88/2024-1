package com.green.day4;

public class VarScope {
    public static void main(String[] args) {
//        스코프 개념은 모든 언어가 동일

//        변수가 선언이 되면 그 변수를 감싸고 있는 중괄호있다.
//        그 중괄호를 벗어나면 죽습니다.

        if (1>0){
            int num = 10;
        }
        //System.out.println(num);
    }
}
