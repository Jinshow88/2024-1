package com.green.day5.ch2;

import java.io.PrintStream;

public class Naming {
    public static void main(String[] args){
        /*
        네이밍 규칙
        1. 변수 명명규칙


        대소문자가 구분, 길이제한 x
        int asd,Asd,aSd,aSD;
        int ASDFADFASDfasdfASDFAsdfaSfaDF;

        2.예약어 사용 금지 파란글씨

        3.숫자로 시작 x,숫자가 시작만 아니면 상관없다.
        int 1asd;

        4.특수기호는_,$만 허용

        5. 여러단어로 구성된 이름은 카멜 케이스 기법을 사용한다.
        >e.g. lastm index,of >>>lastIndexOf
              happy,sunday,morning >>> happySundayMorning

        6. 케밥 케이스 기법
            happy-sunday-morning
        7. 스네이크 케이스 기법
            happy_sunday_morning

        */

        /*
        클래스 명명규칙
        1. 클래스 이름의 첫글자는 무조건 대문자로 시작!
        2.여러단어로 구성된 이름은 첫 글자를 모두 대문자로 한다. > 파스칼 케이스 기법
        > e.g. last, index, of >>> LastIndexOf
               string,buffer >>> StringBuffer
         */

        /*
        상수 명명규칙
        0. 데이터 타입 앞에 final 키워드가 들어간다.
        1. 상수 이름은 모두 대문자로 한다. 단어 구분은 '_'로 한다.
        2. 1번 방식으로 이름을 작성하는건 primitive type일 때 하는 편이다.
        > e.g. last,index,of >>> LAST_INDEX_OF
               string, buffer >>> STRING_BUFFER
         */

        final int LAST_INDEX_OF = 10;
        final String NAME = "홍길동";

        PrintStream ps = System.out;



    }
}
