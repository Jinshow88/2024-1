package com.green.day9.ch5;

public class ArrayStudy {
    public static void main(String[]args){
        int n1=10, n2=20,n3=30,n4=40,n5=50;

        System.out.println(n1);
        n1 =11;
        System.out.println(n1);

        int[] numArr = new int[10];
        System.out.println("numArr[1]:" +numArr[1]);
        numArr[1] = 11;
        System.out.println("numArr[1]:" +numArr[1]);

        int[] numArr2 = {10,20,30,40,50};
        System.out.println("numArr2[1]:" +numArr2[1]);
        numArr2[1] = 25;
        System.out.println("numArr2[1]:" +numArr2[1]);
        int[] numArr3 = new int[]{ 10,20,30};
        System.out.println("numArr3[1]:" +numArr3[1]);
        numArr3[1] = 25;
        System.out.println("numArr3[1]:" +numArr3[1]);

        String[] strArr = new String[5];
        System.out.println("strArr[0]: "+strArr[0]);
        System.out.println("strArr[1]: "+strArr[1]);
        /*
        배열을 사용하는 이유? 같ㅡㄴ 타입의 여러값을 편하게 사용하게 위해서
        배열의 특징? 크기는 고정(생성후 크기변경 x)
                    index로 사용한다.
                    index는 0번부터 시작된다.
                    마지막 index값은 배열 크기 -1값이다.
                    for문이랑 궁합이 굉장하다.
         */



    }
}
