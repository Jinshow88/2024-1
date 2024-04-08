package com.green.day18;

public class ExamTest {
    public static void main(String[] args) {
        int rVal = Exam.getRandomValue(1, 11);
        int rVal2 = Exam.getRandomValue(5, 21);
        Exam.printOddEven(1);//?짝수 입니다.
        //?홀수있니다.


        for (int i = 100; i < 104; i++) {// 100,99,98,97
            System.out.println(200 - i);
        }
        // val1이 짝수면 val2도 짝수면 val2 - val1 값을 출력,홀수면 그대로 출력
        // val1이 홀수면 val2가 짝수면 val2 - 5 값을 출력, 홀수면 그대로 출력

        Exam.test(rVal, rVal2);

        System.out.println("___________________");

        //n1~n2숫자를 세로로 출력
        Exam.printNumToNum(4, 20);

        int score = Exam.getRandomValue(-100, 200);
        System.out.println("score: " + score);
        String grade = Exam.getGrade(score);
//score값이 0~100사이의 값이 아니면 "점수가 잘못되었습니다." 리턴

//10의 자리 숫자가
// 10, 9 > A
// 8 > B
// 7 > C
// 6 > F

//1의 자리 숫자가
//0~2 -
//3~6 0
//7~9 +

//예를 들어
//100 > A+
//99 > A+
//82 > B-
//75 > C0
        //sxore값이 0~100사이의 값이 아니면 "점수가 잘못되었습니다."

        int sum = Exam.getSumFromTo(8, 20);
        System.out.println("sum : " + sum);


    }
}


class Exam {

    static int getSumFromTo(int n1, int n2) {
        int a = 0;
        for (int i = n1; i <= n2; i++) {
            a += i;
            System.out.println(i);
        }
        return a;
    }


    static String grade(int n1) {
        String a;
        String b;
        a = switch (n1 / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            default -> "F";


        };
        b = switch (n1 % 10) {
            case 0, 1, 2 -> "-";
            case 3, 4, 5, 6 -> "0";
            default -> "+";
        };
        System.out.println(a + b);
        return a + b;
    }


    static String getGrade(int n1) {
        if (n1 > 0 && 100 > n1) {
            System.out.println(n1);
        } else {
            System.out.println("점수가 잘못되었습니다.");
        }
        return "";
    }


    static void printNumToNum(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
//            return;
        }
    }

    static void test(int n1, int n2) {
        if (n1 % 2 == 0 || n2 % 2 == 0) {
            System.out.println(n2 - n1);
        } else if (n1 % 2 == 0 || n2 % 2 == 1) {
            System.out.println(n1);
        } else if (n1 % 2 == 1 || n2 % 2 == 0) {
            System.out.println(n2 - 5);
        } else {
            System.out.println(n2);
        }
    }

    static int getRandomValue(int n1, int n2) {
        int getRandomValue = (int) (Math.random() * (n2 + 1)) + n1;
        return getRandomValue;
    }

    static void printOddEven(int n1) {
        if (n1 % 2 == 0) {
            System.out.println(n1 + "은 짝수 입니다.");
        } else {
            System.out.println(n1 + "은 홀수 있니다.");
        }


    }
}