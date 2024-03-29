package com.green.day12.ch6;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.checkOddEven(10);//짝수 입니다.
        mm.checkOddEven(11);//홀수 입니다.
        mm.checkOddEven(100);//짝수 입니다.
        mm.checkOddEven(13);//홀수 입니다.

        System.out.println("__________________________________");

        int r = mm.abs(10);
        System.out.println(r);

        r = mm.abs(-8);
        System.out.println(r);

        System.out.println("__________________________________");


        int randomValue = mm.gerRandomValue(10);//0~9사이의 랜덤값 리턴
        System.out.println(randomValue);
        randomValue = mm.gerRandomValue(100);//0~99사이의 랜덤값 리턴
        System.out.println(randomValue);

        System.out.println("__________________________________");
        mm.printGugudan(3);

//        System.out.print(3);

        System.out.println("__________________________________");

        int randomValue2 = mm.gerRandomValue(10, 20);//10~19
        System.out.println(randomValue2);
        randomValue2 = mm.gerRandomValue(10, 31);//5~30
        System.out.println(randomValue2);

        System.out.println("__________________________________");

    }
}


class MyMethod {

    int gerRandomValue(int n1, int n2){
        int radomValue2 = (int)(Math.random() * (n2+1)) + n1;
        return radomValue2;
    }


    int printGugudan(int n1) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d X %d = %d\n", n1, i, n1 * i);
        }
        return n1;
    }

//    int printGugudan(int i) {
//        for (i = 2; i < 10; i++) {
//            for (int d = 1; d < 10; d++) {
//                System.out.printf("%d X %d = %d\n", i, d, i * d);
//
//            }
//
//        }
//        return i;
//    }
//






    int gerRandomValue(int n1){
        int gerRandomValue= (int)(Math.random() * n1);
        return gerRandomValue;
    }





    int abs(int n1) {
//int r = n1;
//        return n1 < 0 ? - n1 : n1
        if (n1 > 0) {
//            System.out.println(n1);
        } else {
//            System.out.println(-n1);
            n1 = -n1;
        }
        return n1;
    }


    void checkOddEven(int n1) {


        if (n1 % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
//        System.out.printf("%s수입니다\n",n1 % 2 == 0 ? "짝" : "홀");
    }
}