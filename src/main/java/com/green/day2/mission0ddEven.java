package com.green.day2;

public class mission0ddEven {
    public static void main(String[] arge) {
        int num = (int)(Math.random() * 10) + 1;

        System.out.print(num);
        System.out.print("는(은) ");
        System.out.print(num % 2 == 0 ? "짝" : "홀");
        System.out.println("수입니다.");


//        String s =num % 2 == 0 ? "짝" : "홀";
//        System.out.println(s);


//        int num1 = (int)(Math.random() * 10) + 1;
//        int num = num1 % 2;
//        System.out.println(num1);
//        if (num == 0){
//            System.out.println(num1+"짝수 입니다.");
//        }else if(num ==1){
//            System.out.println(num1+"홀수 입니다.");
//        }


    }
}
