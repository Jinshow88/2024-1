package com.green.day17.ch7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy2 {
    public static void main(String[]args){
        int n1 = 10;
        Integer n2 = 10;
        double d1 = 10.1;
        Double d2 = 10.1;

        List<Integer> list = new ArrayList();//<<<<< 빨간줄이 안생기면 상속관계이다.
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        list.remove(1);
//        list.add("gkgkgk");
        int r1 = list.get(0);

        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.printf("list.get(%d) >>> %d\n",i,list.get(i));
        }
    }
}
