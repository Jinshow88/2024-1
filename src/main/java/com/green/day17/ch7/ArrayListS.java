package com.green.day17.ch7;

import java.util.ArrayList;

public class ArrayListS {
    public static void main(String[]args){

        Object obj = 10;
        obj = "하하하";
        obj = 11.1;

        ArrayList list = new ArrayList( );
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("하하하하하");
        list.add(11.1);


        int r = (int)list.get(0);
        r = (int)list.get(1);
        r = (int)list.get(2);
        r = (int)list.get(3);
    }
}

