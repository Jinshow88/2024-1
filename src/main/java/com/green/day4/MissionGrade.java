package com.green.day4;

public class MissionGrade {
    public static void main(String[] args) {
        //int score = 0~100점사이의 랜덤값이 나올 수 있도록 해주세요.
        int score = (int) (Math.random() * 101);
        System.out.println(score);

        if (score > 100 || score < 0) {
            System.out.println("score점수가 잘못되었습니다.");
        }else{

                String grade = "F";
                if (score >= 90) {
                    grade = "A";
                } else if (score >= 80) {
                    grade = "B";
                } else if (score >= 70) {
                    grade = "C";
                }
                System.out.printf("당신의 학점은 %s입니다.\n", grade);
            }


            if (score >= 90) {
                System.out.println("당신의 학점은 A입니다.");
            } else if (score >= 80) {
                System.out.println("당신의 학점은 B입니다.");
            } else if (score >= 70) {
                System.out.println("당신의 학점은 C입니다.");
            } else {
                System.out.println("당신의 학점은 F입니다.");
            }
        }
        }

