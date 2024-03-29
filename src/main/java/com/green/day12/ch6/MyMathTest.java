package com.green.day12.ch6;

public class MyMathTest {
    public static void main(String[] args){
        MyMath myMath = new MyMath();
        myMath.add(10,20);
        myMath.add(100,200);

        myMath.minus(100,50);
        myMath.minus(200,50);

        myMath.returnAdd(500, 600);// 빨간줄 없으면 리턴 메소드임(99%)
        System.out.println(myMath.returnAdd(500, 600));
        int result = myMath.returnAdd(500, 600);// 빨간줄 없으면 리턴 메소드임(100%)
    }
}
class MyMath {
    //리턴 메소드. void 메소드

    //리턴 타입 메소드명 파라미터(매개변수) >>> 메소드 선언부
    //{} >>> 메소드 구현부
    void add(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);


    }//static 이 없으면객체화 먼저

    int returnAdd(int n1, int n2){
        return n1 + n2;
    }

    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
    }
}