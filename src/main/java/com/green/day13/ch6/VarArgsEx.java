package com.green.day13.ch6;
//가변인자 : 잘 사용하지 않는다
public class VarArgsEx {
    public static void main(String[] args) {
        MyMath3_1 mm = new MyMath3_1();
        mm.sum(1,2);
    }
}

class MyMath3_1 {
    void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    void sum(int...arr) {

    }
}