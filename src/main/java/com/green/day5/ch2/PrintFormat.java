package com.green.day5.ch2;

public class PrintFormat {
    public static void main(String[] args){
        char c = 'A';
        int finger = 10;
        long big = 100_000_000_000L;

        System.out.printf("c=%c,%d\n", c,(int)c);
        System.out.printf("finger=[%5d]\n",finger);
        System.out.printf("finger=[%-5d]\n", finger);
        System.out.printf("finger=[%05d]\n", finger);
        System.out.println(big);


        String url = "www.green.com";
        float f1 = .10f;
        double d = 1.23456789;

        System.out.printf("url=%s\n", url);
        System.out.printf("f1=%f\n", f1);
        System.out.printf("url=%s\n", url);
    }
}
