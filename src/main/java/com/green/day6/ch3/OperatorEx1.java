package com.green.day6.ch3;

public class OperatorEx1 {
    public static void main(String[] args){
        int n1 =3, n2 = 5;

        int r1 = -n1 - n2;
        System.out.println(r1);

        int r2 = n1 + n2 * n1 / n2; //가동성 있게 ()를 표시 해줄것
        System.out.println(r2);

        int r3 = n1 + ((n2 * n1) / n2);
        System.out.println(r3);

        //증감 연산자
        int i = 5, z = 0;
        i++;
        System.out.println("i : " + i);

        i = 5;
        i++;
        System.out.println("i : " + i);

        i = 5;
        z = i++;
        System.out.printf("i : %d,z : %d\n", i, z);

        i = 5;
        z = 0;

        z = ++i;
        System.out.printf("i : %d,z : %d\n", i, z);



        int k = 10;
        System.out.println(k++);//10
        System.out.println(++k);//12
        System.out.println(++k);//13
        System.out.println(k++);//13
        System.out.println(k);//14







    }
}
