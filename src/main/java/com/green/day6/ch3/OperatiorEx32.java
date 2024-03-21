package com.green.day6.ch3;

public class OperatiorEx32 {
    public static void main(String[] args) {
        int x,y,z;
        int absX, absY,absZ;
        char sigX, sigY, sigZ;

        x = 10;
        y = -5;
        z = 0;
        //absX = 식 ? true였을 때 : flase였을때
        absX = x < 0 ? -x : x ;
        absY = y < 0 ? -y : y ;
        absZ = z < 0 ? -z : z ;

        sigX = x == 0 ? ' '
                      : x < 0 ? '-' : '+';
        sigY = y == 0 ? ' '
                      : y < 0 ? '-' : '+';
        sigZ = z == 0 ? ' '
                      : z < 0 ? '-' : '+';

        System.out.printf("x=%c%d\n", sigX, absX);
        System.out.printf("y=%c%d\n", sigY, absY);
        System.out.printf("z=%c%d\n", sigZ, absZ);
    }
}
