package com.green.day13.ch6;

public class PrimitiveRefEx {
    public static void main(String[] args) {
        int num = 10;


        Numbox nb = new Numbox();
        nb.num = 10;

        changeNum(num);
        System.out.println("num : " + num);

        changeNum(nb);
        System.out.println("nb.num : " + nb.num);
    }

    public static void changeNum(Numbox n) {
//        n = new Numbox();
        n.num = 100;
    }

    public static void changeNum(int n) {
        n = 100;
    }


    //void, 파라미터 정수값 1개, 같은 클래스 안에 존재, static ,메소드 명 : changeNum
}


class Numbox {
    int num;
}
