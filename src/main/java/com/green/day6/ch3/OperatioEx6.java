package com.green.day6.ch3;

public class OperatioEx6 {
    public static void main(String[]args ){
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a+b);
        System.out.println(c);


        int d = 1_000_000;
        System.out.println(d);

        long e = 1_000_000 * 1_000_000; //int * int int범위를 벗어나서 오버플오루현상이 나타남
        long f = 1_000_000 * 1_000_000L; //int(long) * long int가 long로 변환되어서 계산됨

        System.out.println("e: " + e);
        System.out.println("f: " + f);

        double g = 10 / 3 ; //double가 아니고 int /int이기 때문에 소수점이 날아감
        double g2 = 10 / (double)3 ; //둘중 하나라도 double로 바꿔지면 double로 나타남
        System.out.println("g: " + g);
        System.out.println("g2: " + g2);
    }
}
