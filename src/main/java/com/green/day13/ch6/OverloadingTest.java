package com.green.day13.ch6;

public class OverloadingTest {
    public static void main(String[] args) {
        MyMath3 myMath3 = new MyMath3();
        myMath3.add(1,2);

    }
}
/*
오보로딩은 매개변수로 구분만 가능하면 작성 가능
오버로딩 : 같은 이름의 메소드를 여러개 작성가능하게 해주는 기법


 */

class MyMath3 {
    int add(int n1, int n2) {
        return n1 + n2;
    }

//      위에 add메소드 int, int 파라미터ㅣㄱ 때문에 구분이 안된다. 그렇기에 불가하다.
//    void add(int nn1, int nn2)


    int add(int n1, double n2) {
        return 0;
    }

}